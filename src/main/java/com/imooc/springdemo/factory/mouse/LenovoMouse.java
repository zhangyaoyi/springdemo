package com.imooc.springdemo.factory.mouse;


public class LenovoMouse implements Mouse {

	@Override
	public void moveup() {
		System.out.print("lenovo mouse moves up.");
	}

}
