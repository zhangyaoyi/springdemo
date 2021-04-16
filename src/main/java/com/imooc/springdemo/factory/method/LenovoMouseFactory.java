package com.imooc.springdemo.factory.method;

public class LenovoMouseFactory implements MouseFactory {

	@Override
	public Mouse createMouse() {
		return new LenovoMouse();
	}

}
