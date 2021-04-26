package com.imooc.springdemo.pattern.factory.abstractf;

import com.imooc.springdemo.pattern.factory.keyboard.HpKeyboard;
import com.imooc.springdemo.pattern.factory.keyboard.KeyBoard;
import com.imooc.springdemo.pattern.factory.mouse.HpMouse;
import com.imooc.springdemo.pattern.factory.mouse.Mouse;

public class HpComputerFactory implements ComputerFactory {

	@Override
	public Mouse createMouse() {
		return new HpMouse();
	}

	@Override
	public KeyBoard createKeyboard() {
		return new HpKeyboard();
	}

}
