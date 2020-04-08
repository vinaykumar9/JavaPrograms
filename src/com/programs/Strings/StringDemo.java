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
    
    
    // == equal to operation
    String s4= "kumar";
    String s5= "kumar";
    System.out.println(" ==case");

    System.out.println(s4==s5);
   
    
    //concat operation
    
    String s6 ="ramu";
    System.out.println("concat operation..............");
    System.out.println(s6.concat("kumar"));
   // (+) operator ...........................
    
    System.out.println("(+) operator..............");
    String s7 ="ramarao";
    
    System.out.println(s7+"babu");
    
    
    //trim method 
    System.out.println("trim operation");
    
    String s8 ="babu   ";
    
    
   System.out.println(s8.trim());
   
   
   //replace all
   
   System.out.println("replace all  method");
   
   
   String s9 = "my name is babu and babu and babu";
   s9 =s9.replaceAll("babu", "reddy");
   
   System.out.println(s9);
   
   
   //split
   System.out.println("split functionality...................");
   
   String s10 = "subburfgban and ban anad aban";
   String[] s1= s10.split("ban");
   
   for(String g:s1){
	   System.out.println(g);
   }
   
   //index of 
   
   
   System.out.println("index of operations");
   
   
   String s11 = "my name is vinay";
   
   System.out.println(s11.indexOf('n'));
   
   //string reverse
   
   System.out.println("String revrsal program..........");
   
   String babu ="vinaybabu";
   String rev= "";
   int length =babu.length();
   for(int i =length-1;i>=0;i--){
	   rev = rev+babu.charAt(i);
   }
   
   System.out.println(rev);
   
   //polindrome program
   
   
   System.out.println("string polindrome program...........");
   
  //uperscase
   
   System.out.println("uppercase letters............");
   
   String data100 = "vinay";
   System.out.println(data100.toUpperCase());
   
   
   
  //lower case
   
   System.out.println("LOwer case letters............");
   
   String data101 = "FVLJLJDFL";
   System.out.println(data101.toLowerCase());
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   		
   
   
   
   
   
   
   
    
 
    
    
    
    
    
    
    


    
    

    
		
		
		
		
	}

}
