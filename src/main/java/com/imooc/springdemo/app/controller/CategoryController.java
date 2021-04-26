package com.imooc.springdemo.app.controller;

import com.imooc.springdemo.app.service.CategoryService;
import com.imooc.springdemo.core.annotation.Autowired;
import com.imooc.springdemo.core.annotation.Controller;

@Controller
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	
	public String getCategory() {
		return categoryService.printCategory();
	}

}
