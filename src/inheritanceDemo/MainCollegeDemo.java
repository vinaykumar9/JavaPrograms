package inheritanceDemo;

public class MainCollegeDemo {

	public static void main(String[] args) {

		
		
/*	Teacher t=new Teacher();
		
		System.out.println("teacher object created");
		
		
		System.out.println(t.i);
		t.attendenceDemo();
		
		
		System.out.println("student object created");
		
		Student s=new Student();
		
		System.out.println(s.i);
		s.attendenceDemo();
		s.tutionFee();*/

		System.out.println("teacher reference pointing to child------------------------------------------------------------");
		
		
		Teacher tt= new Student();
		System.out.println(tt.i);
		tt.attendenceDemo();
	
		
		
	/*	Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		System.out.println(s3.count);


*/
	}

}
