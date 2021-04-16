package com.imooc.springdemo.factory.keyboard;

public class HpKeyboard implements KeyBoard {

	@Override
	public void pressdown() {
		System.out.print("HpKeyboard");
	}

}
