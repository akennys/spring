package com.gqlpk.aop;

public class Test1Service implements ITestService{

	private String name;
	
	@Override
	public void sayHello() {
		System.out.println("hi:" + name);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
