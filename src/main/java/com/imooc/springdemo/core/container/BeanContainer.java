package com.imooc.springdemo.core.container;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import com.imooc.springdemo.core.annotation.Autowired;
import com.imooc.springdemo.core.annotation.Component;
import com.imooc.springdemo.core.annotation.Controller;
import com.imooc.springdemo.core.annotation.Repository;
import com.imooc.springdemo.core.annotation.Service;
import com.imooc.springdemo.core.utils.ClassUtil;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BeanContainer {

	private static ConcurrentHashMap<Class<?>, Object> classBean = new ConcurrentHashMap<Class<?>, Object>();

	private enum ContainerHolder {
		HOLDER;

		private BeanContainer beanContainer = new BeanContainer();

		public BeanContainer getBeanContainer() {
			return HOLDER.beanContainer;
		}
	}
	
	public static BeanContainer getInstance() {
		return ContainerHolder.HOLDER.getBeanContainer();
	}

	public void loadBean(String pkg) {
		Set<Class<?>> classSet = ClassUtil.getClass(pkg);
		classSet.parallelStream()
				.filter(clazz -> clazz.isAnnotationPresent(Controller.class) || clazz.isAnnotationPresent(Service.class)
						|| clazz.isAnnotationPresent(Repository.class) || clazz.isAnnotationPresent(Component.class))
				.forEach(clazz -> {
					try {
						classBean.put(clazz, clazz.newInstance());
					} catch (Exception e) {
						e.printStackTrace();
					}
				});


		getClasses().parallelStream().forEach(clazz -> {
			List<Field> fields = Arrays.asList(clazz.getDeclaredFields());
			fields.parallelStream().forEach(field -> {
				try {
					if (field.isAnnotationPresent(Autowired.class)) {
						Object target = getBean(clazz);
						Class<?> value = getFieldValue(pkg, field);
						field.setAccessible(true);
						field.set(target, getBean(value));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
		});
		
		
	}
	
	private static Class<?> getFieldValue(String pkg, Field field) {
		Class<?> clazz = field.getType();
		Set<Class<?>> classSet = ClassUtil.getClass(pkg);
		List<Class<?>> implList = classSet.parallelStream().filter(clz -> clazz.isAssignableFrom(clz) && clz != clazz).collect(Collectors.toList());
		if (implList.size() != 1) {
			throw new RuntimeException();
		} 
		return implList.get(0);
		
	}
	
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classSet = new HashSet<Class<?>>();
		for (Map.Entry<Class<?>, Object> temp : classBean.entrySet()) {
			classSet.add(temp.getKey());
		}
		return classSet;
	}
	
	public Object getBean(Class<?> clazz) {
		return classBean.get(clazz);
	}
	
}
