package com.imooc.springdemo.factory.simple;

public class Test {
	
	
	public static void main(String[] args) {
		Mouse mouse = new MouseFactory().getMouse("hp");
		mouse.moveup();
	}
}
