package com.imooc.springdemo.core.container;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

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

	public static BeanContainer getInstance() {
		return ContainerHolder.HOLDER.getBeanContainer();
	}

	private enum ContainerHolder {
		HOLDER;

		private BeanContainer beanContainer = new BeanContainer();

		public BeanContainer getBeanContainer() {
			return HOLDER.beanContainer;
		}
	}

	public void loadBean() {
		Set<Class<?>> classSet = ClassUtil.getClass("com.imooc.springdemo");
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

	}
	
	
	public static void main(String[] args) {
		BeanContainer.getInstance().loadBean();
	}
}
