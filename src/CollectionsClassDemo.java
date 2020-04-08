import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsClassDemo {

	public static void main(String[] args) {

		
		
	List<Integer> arr = new ArrayList();
	
	arr.add(23);
	arr.add(3);
	arr.add(12);
	arr.add(83);
	arr.add(37);
	
	
System.out.println("list elements.................");

//1---------------------
/*for(Integer i: arr){
	System.out.println(i);
}*/

//2.......................

Iterator itr = arr.iterator();

while(itr.hasNext()){
	System.out.println(itr.next());
}

/// maximum element
System.out.println("print maximum number in array list");

System.out.println(Collections.max(arr));

/// minimum element
System.out.println("print minimum number in array list");

System.out.println(Collections.min(arr));

//sorting arraylist
  Collections.sort(arr);
  System.out.println("sorted array list.......................");
  for(Integer i: arr){
		System.out.println(i);
	}
  //second largest number using array list
  System.out.println("second largest number in an  array list.......................");

  System.out.println(arr.get(arr.size()-2));
//


	}
	
	
	

}
