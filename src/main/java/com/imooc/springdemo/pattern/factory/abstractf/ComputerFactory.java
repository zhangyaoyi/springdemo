package com.imooc.springdemo.pattern.factory.abstractf;

import com.imooc.springdemo.pattern.factory.keyboard.KeyBoard;
import com.imooc.springdemo.pattern.factory.mouse.Mouse;

public interface ComputerFactory {

	Mouse createMouse();
	
	KeyBoard createKeyboard();
}
