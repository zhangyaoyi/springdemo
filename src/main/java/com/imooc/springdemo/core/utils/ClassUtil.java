package com.imooc.springdemo.core.utils;

import java.io.File;
import java.net.URL;
import java.net.URLDecoder;
import java.util.HashSet;
import java.util.Set;

public class ClassUtil {

	private static final String CLASS = "class";
	
	private static final String PROTOCOL_FILE = "file";

	public static Set<Class<?>> getClass(String pkgName) {

		Set<Class<?>> resultSet = new HashSet<Class<?>>();
		try {

			URL url = getClassLoader().getResource(pkgName.replace(".", "/"));

			String protocol = url.getProtocol();
			if (PROTOCOL_FILE.equals(protocol)) {
				String filePath = URLDecoder.decode(url.getFile(), "UTF-8");
				findClassesByFile(pkgName, filePath, resultSet);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultSet;

	}

	private static void findClassesByFile(String pkgName, String pkgPath, Set<Class<?>> resultSet) throws ClassNotFoundException {
		
		File dir = new File(pkgPath);

		if (!dir.exists() || !dir.isDirectory()) {
			return;
		}

		File[] dirfiles = dir.listFiles(pathname -> pathname.isDirectory() || pathname.getName().endsWith(CLASS));
		if (dirfiles == null || dirfiles.length == 0) {
			return;
		}

		for (File f : dirfiles) {
			if (f.isDirectory()) {
				findClassesByFile(pkgName + "." + f.getName(), pkgPath + "/" + f.getName(), resultSet);
				continue;
			}
			String className = f.getName();
			className = className.substring(0, className.length() - 6);

			Class<?> clz = getClassLoader().loadClass(pkgName + "." + className);
			if (clz != null) {
				resultSet.add(clz);
			}
		}
	}

	private static ClassLoader getClassLoader() {
		return Thread.currentThread().getContextClassLoader();
	}
	
}
