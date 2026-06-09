package day4;

public class College {
	public static void main(String[] args) {
		//classname ref = new classname(); - object creation - instantiation
		Student s1 = new Student();
		s1.id=12;
		s1.name="hari";
		s1.grade='1';
		s1.section='A';
		s1.gender='m';
		System.out.println("Student 1 id: " +s1.id);//12
		System.out.println(Student.schoolName);
		s1.attendSession();//instance method
		s1.submitProject();
		Student.getSchoolName();
		
		
		Student s2 = new Student();
		s2.id=45;
		s2.name="raj";
		s2.grade='3';
		s2.section='B';
		s2.gender='m';
		System.out.println("Student 2 name: " +s2.name);
		s2.attendSession();
		s2.submitProject();
	}
}
