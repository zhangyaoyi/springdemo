package com.imooc.springdemo.factory.abstractf;

import com.imooc.springdemo.factory.keyboard.KeyBoard;
import com.imooc.springdemo.factory.mouse.Mouse;

public class Test {
	public static void main(String[] args) {
		ComputerFactory computerFactory = new HpComputerFactory();
		KeyBoard keyBoard = computerFactory.createKeyboard();
		keyBoard.pressdown();
		Mouse mouse = computerFactory.createMouse();
		mouse.moveup();
	}
}
