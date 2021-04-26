package com.imooc.springdemo.app.service;

import com.imooc.springdemo.core.annotation.Service;

@Service
public class HeadlineServiceImpl implements HeadlineService {

	@Override
	public String printHeadLine() {
		return "Hello headline!";
	}

}
