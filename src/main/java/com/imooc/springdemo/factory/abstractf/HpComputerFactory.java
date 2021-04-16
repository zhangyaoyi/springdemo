package com.imooc.springdemo.factory.abstractf;

import com.imooc.springdemo.factory.keyboard.HpKeyboard;
import com.imooc.springdemo.factory.keyboard.KeyBoard;
import com.imooc.springdemo.factory.mouse.HpMouse;
import com.imooc.springdemo.factory.mouse.Mouse;

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
