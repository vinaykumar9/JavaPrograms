import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] ={23,45,2,76,3};
		List<Integer> arr = Arrays.asList(a);
		
		System.out.println(Arrays.equals(a, a));
	
      Collections.sort(arr);
		
      for(Integer i : arr){
    	  System.out.println(i);
      }

	}

}
