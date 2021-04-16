package com.imooc.springdemo.factory.method;

import com.imooc.springdemo.factory.mouse.DellMouse;
import com.imooc.springdemo.factory.mouse.Mouse;

public class DellMouseFactory implements MouseFactory {

	@Override
	public Mouse createMouse() {
		return new DellMouse();
	}

}
