package inheritanceDemo;

public class AdditionClassExample {
	
	public void add(){
		System.out.println(2+3);
	}

	
	public void add(int i){
		System.out.println(++i);
	}
	
	public void add(int i, int j){
		System.out.println(i+j);
	}
	
	
	public void add (float f, int j){
		System.out.println(f+j);
	}
	
	public void add(int i, float k){
		System.out.println(i+k);
	}
	
}
