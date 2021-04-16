package com.imooc.springdemo.factory.method;

import com.imooc.springdemo.factory.mouse.LenovoMouse;
import com.imooc.springdemo.factory.mouse.Mouse;

public class LenovoMouseFactory implements MouseFactory {

	@Override
	public Mouse createMouse() {
		return new LenovoMouse();
	}

}
