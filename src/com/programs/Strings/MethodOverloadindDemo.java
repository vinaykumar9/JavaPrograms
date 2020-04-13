package com.programs.Strings;

public class MethodOverloadindDemo {

	
	public void add(int i, int j){
		
		System.out.println(i+j);
	}
	
	
}

class method2 extends MethodOverloadindDemo {
	public void add(String i, String j){
		System.out.println(i+j);
		
	}
	
}