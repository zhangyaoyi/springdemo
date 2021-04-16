package com.imooc.springdemo.factory.keyboard;

public class DellKeyboard implements KeyBoard {

	@Override
	public void pressdown() {
		System.out.print("DellKeyboard");
		
	}

}
