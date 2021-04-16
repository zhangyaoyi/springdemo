package com.imooc.springdemo.factory.simple;

import com.imooc.springdemo.factory.mouse.DellMouse;
import com.imooc.springdemo.factory.mouse.HpMouse;
import com.imooc.springdemo.factory.mouse.Mouse;

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
