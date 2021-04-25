package com.imooc.springdemo.core.utils;

import java.io.File;
import java.net.URL;
import java.net.URLDecoder;
import java.util.HashSet;
import java.util.Set;

public class ClassUtil {

	public static Set<Class<?>> getClass(String pkgName) {

		Set<Class<?>> resultSet = new HashSet<Class<?>>();
		try {
			String pkgDirName = pkgName.replace(".", "/");

			URL url = ClassUtil.class.getClassLoader().getResource(pkgDirName);

			String protocol = url.getProtocol();
			if ("file".equals(protocol)) {
				String filePath = URLDecoder.decode(url.getFile(), "UTF-8");
				findClassesByFile(pkgName, filePath, resultSet);

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return resultSet;

	}

	private static void findClassesByFile(String pkgName, String pkgPath, Set<Class<?>> resultSet) {
		File dir = new File(pkgPath);

		if (!dir.exists() || !dir.isDirectory()) {
			return;
		}

		File[] dirfiles = dir.listFiles(pathname -> pathname.isDirectory() || pathname.getName().endsWith("class"));
		if (dirfiles == null || dirfiles.length == 0) {
			return;
		}

		String className;
		Class<?> clz;

		for (File f : dirfiles) {
			if (f.isDirectory()) {
				findClassesByFile(pkgName + "." + f.getName(), pkgPath + "/" + f.getName(), resultSet);
				continue;
			}
			className = f.getName();
			className = className.substring(0, className.length() - 6);

			clz = loadClass(pkgName + "." + className);
			if (clz != null) {
				resultSet.add(clz);
			}
		}
	}

	private static Class<?> loadClass(String fullClzName) {
		try {
            return Thread.currentThread().getContextClassLoader().loadClass(fullClzName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
	}
}
