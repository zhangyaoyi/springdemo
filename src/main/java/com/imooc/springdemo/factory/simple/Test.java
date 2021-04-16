package com.imooc.springdemo.factory.simple;

import com.imooc.springdemo.factory.mouse.Mouse;

public class Test {
	
	
	public static void main(String[] args) {
		Mouse mouse = new MouseFactory().getMouse("hp");
		mouse.moveup();
	}
}
