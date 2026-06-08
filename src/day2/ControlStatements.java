package day2;

public class ControlStatements {

	public static void main(String[] args) {
		/*
		 * if
		 * if - else
		 * if - else if - else
		 * grading 
		 * marks >=75 - Grade - A
		 * marks <75 && marks>=60 - B
		 * marks <60 && marks>=50 - c
		 * marks <50 && marks>=40 - D
		 * else - Fail
		 * switch
		 */
		
		int age=2;
		if(age>=18) {
			System.out.println("Cast the vote");
		}
		else {
			System.out.println("You cannot Cast the vote");
		}

		
		int marks=23;
		if(marks >=75) {
			System.out.println("A");
		}
		else if(marks <75 && marks>=60) {
			System.out.println("B");
		}
		else if(marks <60 && marks>=50) {
			System.out.println("C");
		}
		else if(marks <50 && marks>=40) {
			System.out.println("D");
		}
//		else if(marks<40) {
//			System.out.println("Fail");
//		}
		else {
			System.out.println("Fail");
		}
		
		
		int day=5;
		switch (day) {
		case 1: {
			System.out.println("Monday");
			break;
		}
		case 2: {
			System.out.println("Tuesday");
			break;
		}
		
		case 3: {
			System.out.println("Wednesday");
			break;
		}
		case 4: {
			System.out.println("Thursday");
			break;
		}
		case 5: {
			System.out.println("Friday");
			break;
		}
		case 6: {
			System.out.println("Saturday");
			break;
		}
		case 7: {
			System.out.println("Sunday");
			break;
		}
		
		default:{
			System.out.println("Invalid day input");
			break;
		}
			
			
		}
		
	}

}
