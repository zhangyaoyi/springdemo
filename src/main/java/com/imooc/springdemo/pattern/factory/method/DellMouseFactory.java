package com.imooc.springdemo.pattern.factory.method;

import com.imooc.springdemo.pattern.factory.mouse.DellMouse;
import com.imooc.springdemo.pattern.factory.mouse.Mouse;

public class DellMouseFactory implements MouseFactory {

	@Override
	public Mouse createMouse() {
		return new DellMouse();
	}

}
