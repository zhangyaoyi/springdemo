package com.imooc.springdemo.pattern.factory.keyboard;

public class LenovoKeyboard implements KeyBoard {

	@Override
	public void pressdown() {
		System.out.print("LenovoKeyboard");
	}

}
