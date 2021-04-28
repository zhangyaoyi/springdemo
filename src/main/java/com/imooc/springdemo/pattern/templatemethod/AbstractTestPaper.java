package com.imooc.springdemo.pattern.templatemethod;

public abstract class AbstractTestPaper {
	
	private String name;
	
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void TestQuestion1(){
        System.out.println("第1题");
        System.out.println("答案"+Answer1());
    }

    public abstract String Answer1();

    public void TestQuestion2(){
        System.out.println("第2题");
        System.out.println("答案"+Answer2());
    }

    public abstract String Answer2();

    public void TestQuestion3(){
        System.out.println("第3题");
        System.out.println("答案"+Answer3());
    }

    public abstract String Answer3();

}
