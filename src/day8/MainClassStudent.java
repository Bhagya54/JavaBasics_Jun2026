package day8;

public class MainClassStudent {

	public static void main(String[] args) {
		Student s1 = new Student();
		//s1.setId(123);
		System.out.println(s1.getId());
		
		s1.setGender('z');
		System.out.println(s1.getGender());

	}

}
