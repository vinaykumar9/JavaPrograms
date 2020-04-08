package com.programs.Strings;

public class StringDemo {

	public static void main(String[] args) {
    String s= "vinay";
    System.out.println("before adding");

    System.out.println(s);
    
    System.out.println("after adding");
   s = s.concat("kumar");
    System.out.println(s);
    System.out.println(s);

    
    //equals method
    
    String data1 ="vinay";
    String data2 = "vinay";
    String data3 = "ramu";
    String data4 = "Vinay";
    String data5 = new String("vinay");
    
    
    
    System.out.println(data1.equals(data2));
    System.out.println(data1.equals(data3));
    System.out.println(data1.equals(data4));
    System.out.println(data1.equals(data5));
    
    //EQUAL IGNORE CASE
    System.out.println("equal ignore case");
   
    System.out.println(data1.equalsIgnoreCase(data4));


    
    

    
		
		
		
		
	}

}
