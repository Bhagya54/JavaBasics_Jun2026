package day10;

public class RunTimeException {
/*
 * java.lang.ArrayIndexOutOfBoundsException
 * java.lang.NullPointerException
 * java.lang.ArithmeticException: / by zero
 * java.lang.NumberFormatException
 */
	public static void main(String[] args) {
		
		String s1="dfds";
		int i1=Integer.parseInt(s1);
		System.out.println(i1);
		
		int a=10;
		int b=10/0;
		System.out.println(b);
		
		String st1=null;
		System.out.println(st1.length());
		
		int[] arr1 = new int[5];
		System.out.println(arr1[7]);

	}

}
