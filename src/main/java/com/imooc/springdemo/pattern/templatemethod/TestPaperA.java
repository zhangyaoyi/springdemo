package com.imooc.springdemo.pattern.templatemethod;

public class TestPaperA extends AbstractTestPaper {

	@Override
	public String Answer1() {
		return "a";
	}

	@Override
	public String Answer2() {
		return "b";
	}

	@Override
	public String Answer3() {
		return "c";
	}

}
