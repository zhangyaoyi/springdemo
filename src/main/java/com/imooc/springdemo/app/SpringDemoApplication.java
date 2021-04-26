package com.imooc.springdemo.app;

import com.imooc.springdemo.core.container.BeanContainer;

public class SpringDemoApplication {
	
	public static void main(String[] args) {
		BeanContainer.getInstance().loadBean("com.imooc.springdemo.app");
	}
}
