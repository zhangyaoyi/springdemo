package com.imooc.springdemo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class DispatcherServlet extends HttpServlet {

	private static final long serialVersionUID = 2637226014780077955L;
	
	private static Integer count = 0;
	
	@Override
	public void destroy() {
		System.out.print("destroy");
		super.destroy();
	}

	@Override
	public void init() throws ServletException {
		System.out.print("init");
		super.init();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		count ++;
		System.out.print(count);
	}

}
