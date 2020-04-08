
public class SecondLargestNumberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] ={23,3,56,7,38};
		
		int length =arr.length;
		int temp;
		
		
		for(int i =0;i<length;i++){
			for(int j=i+1;j<length;j++){
				
				if(arr[i]>arr[j]){
					temp = arr[i];
					arr[i]=arr[j];
					arr[j] =temp;
				}
				
			}
		}
		System.out.println("print all elements");
		for(int i=0;i<length;i++){
			System.out.println(arr[i]);
		}

		System.out.println("second largest number......................");

		System.out.println(arr[length-2]);
		
	}

}
