package com.imooc.springdemo.pattern.factory.keyboard;

public class HpKeyboard implements KeyBoard {

	@Override
	public void pressdown() {
		System.out.print("HpKeyboard");
	}

}
