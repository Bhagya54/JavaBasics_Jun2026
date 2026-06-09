package day4;

public class Student {
//properties - variables - id,name,section,grade,gender
	//behaviour - method-attendSession,submitProject
int id;
String name;
char grade;
char section;
char gender;
static String schoolName;

public void attendSession() {
	int a=10;//local variable - present inside a method
	System.out.println("Student attends sessions"+id);
	System.out.println("schoolName: " +schoolName );
}

public void submitProject() {
	System.out.println("Student submits project"+name);
	System.out.println("schoolName: " +schoolName );
}


public static void getSchoolName() {
	System.out.println(schoolName);
	//System.out.println(id);
	
}
	

}
