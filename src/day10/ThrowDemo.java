package day10;

public class ThrowDemo {
	
	static void validate(int age) throws Exception  {
		
		if(age>18) {
			System.out.println("You are good to vote");
		}
		else {
			
			throw new Exception("You are not eligible to vote");
			
		}
		
	}

	public static void main(String[] args) {
		try {
			validate(12);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
