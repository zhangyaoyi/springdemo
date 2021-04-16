package com.imooc.springdemo.factory.method;

public class Test {
	public static void main(String[] args) {
		MouseFactory mouseFactory = new DellMouseFactory();
		Mouse mouse = mouseFactory.createMouse();
		mouse.moveup();
	}
}