package HashTableDemo;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class HashTableDemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable ht = new Hashtable();

		
		 ht.put(1, "tom");
		 ht.put(2, "test");

		 ht.put(3, "selenium");
		 
		 //create clone copy /shallow copy of hashtable
		 
		 
		 
			Hashtable<Integer,String> h = new Hashtable<>();
			
			h=(Hashtable)ht.clone();
			System.out.println("The values from ht object"+ht);

			System.out.println("The values from hobject"+h);
			
			ht.clear();
			System.out.println("The values from ht object"+ht);

			System.out.println("The values from hobject"+h);
			
			Hashtable h3 = new Hashtable();
			h3.put("a", "naveen");
			
			h3.put("v", "manger");

			h3.put("c", "selenium");
			
			if(h3.contains("naveen")){
				
				System.out.println("value  is  found in hash table ");
				
			}
			
			//Print all the values in hash table by using Enumeration ---elements()
			
			Enumeration e =h3.elements();
			System.out.println("print the values from enumerator");
			while(e.hasMoreElements()){
				System.out.println(e.nextElement());
			}
			
		//get  all the values  from hash table using -entrySet---set of hasth table values
			
System.out.println("print hashcode of particular element present in hashtable"+h3.get("a").hashCode());			



//no null key and null values ar alloweded


/*h3.put(null, "daya");
h3.put("df",null);
System.out.println("values and keys are"+h3);
*/

HashMap hh = new HashMap();

hh.put("a", "ramu");
hh.put("b", null);
hh.put("c", null);
//hash map we will allow one null key and no of null values-------accepted

hh.put(null, "daya");
hh.put(null, "mango");
System.out.println("hashmap implementation------------data");

System.out.println(hh);

	}

}
