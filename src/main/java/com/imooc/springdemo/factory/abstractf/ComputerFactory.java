package com.imooc.springdemo.factory.abstractf;

import com.imooc.springdemo.factory.keyboard.KeyBoard;
import com.imooc.springdemo.factory.mouse.Mouse;

public interface ComputerFactory {

	Mouse createMouse();
	
	KeyBoard createKeyboard();
}
