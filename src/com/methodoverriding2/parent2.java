package com.methodoverriding2;

public class parent2 {

	 // Static method in base class ,which will be hidden in subclass 
    static void m1() 
    { 
        System.out.println("From parent "
                           + "static m1()"); 
    } 
  
    // Non-static method which will 
    // be overridden in derived class 
    void m2() 
    { 
        System.out.println("From parent "
                           + "non-static(instance) m2()"); 
    } 
} 
  
class Child extends parent2 { 
    // This method hides m1() in Parent 
    static void m1() 
    { 
        System.out.println("From child static m1()"); 
    } 
  
    // This method overrides m2() in Parent 
    @Override
    public void m2() 
    { 
        System.out.println("From child "
                           + "non-static(instance) m2()"); 
    } 
} 