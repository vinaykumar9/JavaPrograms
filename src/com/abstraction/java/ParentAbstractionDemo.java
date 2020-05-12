package com.abstraction.java;

public abstract class ParentAbstractionDemo {
	  int i=29;
	
	public ParentAbstractionDemo(){
		System.out.println("ParentAbstractionDemo constructor is invoked");
	}
	
	
	abstract void add();
	
	abstract void sub();
	
	abstract void mul();
	
	public void method1(){
		System.out.println("method executed");
	}
	
	static void method2(){
		System.out.println("static method2 got invoked");
	}
	

}

 class Data extends ParentAbstractionDemo {
	 
	 int i=10;

	@Override
	void add() {
System.out.println("data class method add method");	
	}

	@Override
	void sub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void mul() {
		// TODO Auto-generated method stub
		
	}
	
}
