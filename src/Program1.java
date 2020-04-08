
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i =0,temp;
		
		int[] a1 ={17,23,4,36,74,8};
		
		int n= a1.length;
		for(i=0;i<a1.length;i++){
			for(int j=i+1;j<a1.length;j++){
				if(a1[i]>a1[j]){
					temp =a1[i];
					a1[i] =a1[j];
					a1[j] =temp;
					
					
				}
								
			}
			
		}

		
		for(i=0;i<a1.length;i++){
			System.out.println(a1[i]);
		}
		
		System.out.println("second largest number"+a1[n-2]);
	}

}
