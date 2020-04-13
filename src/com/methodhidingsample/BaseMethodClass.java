package com.methodhidingsample;

public class BaseMethodClass {


    public static void printMessage() {
        System.out.println("base static method");
    }
}

 class ChildMethodClass extends BaseMethodClass {
	 
    public static void printMessage() {
        System.out.println("child static method");
    }
}