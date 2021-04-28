package com.imooc.springdemo.pattern.templatemethod;

public class Test {
	
	public static void main(String[] args) {
		AbstractTestPaper testPaperA = new TestPaperA();
		testPaperA.TestQuestion1();
		testPaperA.TestQuestion2();
		testPaperA.TestQuestion3();
		
		AbstractTestPaper testPaperB = new TestPaperB();
		testPaperB.TestQuestion1();
		testPaperB.TestQuestion2();
		testPaperB.TestQuestion3();
	}

}
