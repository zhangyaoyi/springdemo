package com.imooc.springdemo.pattern.factory.method;

import com.imooc.springdemo.pattern.factory.mouse.Mouse;

public class Test {
	public static void main(String[] args) {
		MouseFactory mouseFactory = new DellMouseFactory();
		Mouse mouse = mouseFactory.createMouse();
		mouse.moveup();
		
		MouseFactory lFactory = new LenovoMouseFactory();
		Mouse mouse2 = lFactory.createMouse();
		mouse2.moveup();
	}
}
