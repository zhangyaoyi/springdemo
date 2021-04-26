package com.imooc.springdemo.app.service;

import com.imooc.springdemo.core.annotation.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Override
	public String printCategory() {
		return "Hello Category!";
	}

}
