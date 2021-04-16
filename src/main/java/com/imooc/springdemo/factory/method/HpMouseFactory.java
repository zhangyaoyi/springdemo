package com.imooc.springdemo.factory.method;

public class HpMouseFactory implements MouseFactory {

	@Override
	public Mouse createMouse() {
		return new HpMouse();
	}

}
