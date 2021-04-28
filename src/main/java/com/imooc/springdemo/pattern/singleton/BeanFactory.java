package com.imooc.springdemo.pattern.singleton;

public class BeanFactory {
	
	private BeanFactory() {}
	
	private static BeanFactory instance = new BeanFactory();

	public static BeanFactory getInstance() {
		return instance;
	}

}
