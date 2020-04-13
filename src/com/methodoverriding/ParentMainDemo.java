package com.methodoverriding;

public class ParentMainDemo {

	 public static void main(String[] args) 
	 { 
	     // If a Parent type reference refers 
	     // to a Parent object, then Parent's 
	     // show is called 
	     Parent obj1 = new Parent(); 
	    // obj1.show(); 
	     System.out.println("parent object creation");
	   //  System.out.println("j value" +obj1.k);// we can't acces child type refrence
	     

	     System.out.println(obj1.i);

	     // If a Parent type reference refers 
	     // to a Child object Child's show() 
	     // is called. This is called RUN TIME 
	     // POLYMORPHISM. 
	     Parent obj2 = new Child(); 
	     System.out.println("parent  reference child object creation");
	     System.out.println(obj2.i);
	     System.out.println("j value-parent refrence" +obj2.j);
	    // System.out.println("k value" +obj2.k); - we can't access child specific variables preseent 
	     
	    //obj2.show(); 
	    //obj2.data1();
	    //obj2.add("data","fhf");
	    
	    System.out.println("child object reference creation");
	    Child obj3 = new Child();
	    System.out.println("child object creation");
	     System.out.println(obj3.i);
	     System.out.println("j value" +obj3.j);
	     

	    //obj3.add(3,4);
	    //obj3.add("string", "data");
	 } 
	} 