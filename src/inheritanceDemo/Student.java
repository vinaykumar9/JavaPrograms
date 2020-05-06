package inheritanceDemo;

public class Student extends Teacher {
	
	
	int i=13;
	static int count;
	
	public Student(){
		System.out.println("student constructor loaded");
		count++;
	}
	
public void read(int i){
		int j=5;
		System.out.println("Student is reading");
	}
	
	
	public void tutionFee(){
		
		System.out.println("student tution fee");		
	}
	
	public void attendenceDemo(){
		System.out.println("student reference attendence noticed");
	}

}
