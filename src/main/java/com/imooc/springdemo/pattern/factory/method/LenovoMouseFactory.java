package com.imooc.springdemo.pattern.factory.method;

import com.imooc.springdemo.pattern.factory.mouse.LenovoMouse;
import com.imooc.springdemo.pattern.factory.mouse.Mouse;

public class LenovoMouseFactory implements MouseFactory {

	@Override
	public Mouse createMouse() {
		return new LenovoMouse();
	}

}
