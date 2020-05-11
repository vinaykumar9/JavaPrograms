package com.methodhidingsample;

public class MethodHidingMAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		//BaseMethodClass base = new BaseMethodClass();
		
		
		
		BaseMethodClass child = new ChildMethodClass();
		child.printMessage();
		
		ChildMethodClass cc = new ChildMethodClass();
		cc.printMessage();
		
	}

}
