package com.imooc.springdemo.pattern.factory.simple;

import com.imooc.springdemo.pattern.factory.mouse.DellMouse;
import com.imooc.springdemo.pattern.factory.mouse.HpMouse;
import com.imooc.springdemo.pattern.factory.mouse.Mouse;

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
