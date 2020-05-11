package com.comparator;

import java.util.Comparator;

public class MyCompartor implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		//return i1.compareTo(i2); //Ascending order
		//return -i1.compareTo(i2);  Descending order
		//return i2.compareTo(i1);  Descending order
		//return -i2.compareTo(i1);Ascending order
        // return +1;  insertion order
        // return -1; reverse insertion order
         //return 0; [10]
		if(i1>i2){
			return - 1;
		}
		else if(i1<i2){
		return +1;	
		}
		
		else{
			
			return 0;
		}

		
	}
	
	

}
