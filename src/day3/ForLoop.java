package day3;

public class ForLoop {

	public static void main(String[] args) {
		/*
		 * for - 5 to 50 > 5 10 15 20 25
		 * while
		 * do-while
		 */
		
		for(int i=1;i<=5;i++)//i=6<=5
		{
		System.out.println("hello");
		System.out.println("World");
		}
		
		System.out.println("Outside the loop");
		
		System.out.println("Print 5 to 50");
		for(int i=5;i<=50;i=i+5) {
			System.out.print(i + " ");
		}
		
		//100 90 80 70 60 50
		System.out.println("Revese count");
		for(int i=100;i>=50;i=i-10) {
			System.out.println(i);
		}
		
	}

}
