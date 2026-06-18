package day7;

public class MethodOverloadingDemo {
	
	public void sum(int a,int b) {
		System.out.println("Sum of 2 integer value: " + (a+b));
	}
	
	public void sum(double a,double b) {
		System.out.println("Sum of 2 double value: " + (a+b));
	}

	public void sum(int a,int b,int c) {
		System.out.println("Sum of 3 integer value: " + (a+b+c));
	}
	
	public static void main(String[] args) {
		MethodOverloadingDemo mo = new MethodOverloadingDemo();
		mo.sum(12, 13);
		mo.sum(23.09, 12.34);
		mo.sum(12,13,14);
	}

}
