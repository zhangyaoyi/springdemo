package com.imooc.springdemo.factory.method;

import com.imooc.springdemo.factory.mouse.HpMouse;
import com.imooc.springdemo.factory.mouse.Mouse;

public class HpMouseFactory implements MouseFactory {

	@Override
	public Mouse createMouse() {
		return new HpMouse();
	}

}
