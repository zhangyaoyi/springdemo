package com.imooc.springdemo.factory.simple;

public class MouseFactory {
	
	public Mouse getMouse(String mouseType) {
		if ("dell".equals(mouseType)) {
			return new DellMouse();
		} else if ("hp".equals(mouseType)) {
			return new HpMouse();
		} 
		return null;
	}
}
