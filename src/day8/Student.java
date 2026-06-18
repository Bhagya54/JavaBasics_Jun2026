package day8;

public class Student {

	private int id=567;//read and write 
	private String name;
	private char grade;
	private char gender;
	//getters and setters methods
	
	public void setGender(char gender) {
		if(gender == 'm'|| gender=='f') {
		this.gender = gender;
		}
		else {
			System.out.println("Invalid gender value");
		}
	}
	
	public char getGender() {
		return gender;
	}
	
	public int getId() {//read
		return id;
	}
	
}
