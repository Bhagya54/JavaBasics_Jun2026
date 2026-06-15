package day4;

public class MethodSignatures {
	
	//No return type, No parameter
	public void hello() {
		System.out.println("Hello everyone");
	}
	
	//Return type - String, No Parameter
	public String getName() {
		return "Giri";
	}
	
	public int getId(){
		return 34;
	}
	
	//Return type - int , Parameters
	public int sum(int a,int b) {
		//int c=a+b;
		return a+b;
	}
	
	

	public static void main(String[] args) {
		MethodSignatures m1=new MethodSignatures();
		m1.hello();
		System.out.println(m1.getName());
		System.out.println(m1.getId());
		System.out.println("Sum of 2 values is: " +m1.sum(20,30));
		System.out.println("Sum of 2 values is: " +m1.sum(23,56));
	}

}
