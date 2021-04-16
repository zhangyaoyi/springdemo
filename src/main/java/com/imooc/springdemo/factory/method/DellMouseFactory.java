package com.imooc.springdemo.factory.method;

public class DellMouseFactory implements MouseFactory {

	@Override
	public Mouse createMouse() {
		return new DellMouse();
	}

}
