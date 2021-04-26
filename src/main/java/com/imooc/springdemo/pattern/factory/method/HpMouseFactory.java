package com.imooc.springdemo.pattern.factory.method;

import com.imooc.springdemo.pattern.factory.mouse.HpMouse;
import com.imooc.springdemo.pattern.factory.mouse.Mouse;

public class HpMouseFactory implements MouseFactory {

	@Override
	public Mouse createMouse() {
		return new HpMouse();
	}

}
