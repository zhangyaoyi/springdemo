package com.imooc.springdemo.app.controller;

import com.imooc.springdemo.app.service.HeadlineService;
import com.imooc.springdemo.core.annotation.Autowired;
import com.imooc.springdemo.core.annotation.Controller;

@Controller
public class HeadlineController {

	@Autowired
	private HeadlineService headlineService;
}

