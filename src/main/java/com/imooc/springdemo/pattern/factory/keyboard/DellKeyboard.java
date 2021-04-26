package com.imooc.springdemo.pattern.factory.keyboard;

public class DellKeyboard implements KeyBoard {

	@Override
	public void pressdown() {
		System.out.print("DellKeyboard");
		
	}

}
