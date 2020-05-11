package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class TressetMainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeSet t = new TreeSet(new MyCompartor());
		
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(20);
		t.add(20);
		t.add(56);
		t.add(2);
		
	ArrayList list =  new ArrayList();
	
	list.add(26);
	list.add(6);
	list.add(63);
	
	Collections.reverse(list);
	Collections.sort(list);
	Collections.max(list);
	Collections.min(list);
		System.out.println(list);
		System.out.println(Collections.max(list));
		System.out.println(	Collections.min(list));
		
		System.out.println(list.get(list.size()-2));
		
		
		TreeSet t2 =  new TreeSet();
		t2.add(new StringBuffer("abc"));
		
		 
		
	}
	

}
