package com.methodoverriding;


//A Simple Java program to demonstrate 
//method overriding in java 

//Base Class 
class Parent {
	
	int i=4;
	int j=8;
 void show() 
 { 
     System.out.println("Parent's show()"); 
 } 
 
 public void data1(){
	 System.out.println("parent data1() method");
 }
 
 
 public void add (int i, int j){
	 System.out.println("parent add method");
	 System.out.println(i+j);
 }
} 

//Inherited class 
class Child extends Parent { 
 // This method overrides show() of Parent 
	int i=20;
	int k=50;
	
  public void data1(){
	  System.out.println("data1() child method");
  }
  
  public void add(String a, String b){
	  
	  System.out.println("child add method");
	  System.out.println(a+b);
  }
 @Override
 void show() 
 { 
     System.out.println("Child's show()"); 
 } 
} 

