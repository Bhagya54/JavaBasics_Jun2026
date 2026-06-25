package day10;

public class RunTimeException {
/*
 * java.lang.ArrayIndexOutOfBoundsException
 * java.lang.NullPointerException
 * java.lang.ArithmeticException: / by zero
 * java.lang.NumberFormatException
 */
	public static void main(String[] args) {
		try {
		String s1="123";
		int i1=Integer.parseInt(s1);
				
		int a=10;
		int b=10/2;
		System.out.println(b);
		
		String st1="hello";
		System.out.println(st1.length());
		
		int[] arr1 = new int[5];
		System.out.println(arr1[7]);
		}
		
		
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception has occured");
		}
		
		catch (NumberFormatException e) {
			System.out.println("Number Format Exception has occured");
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index out of bound Exception has occured");
		}
		
		catch(Exception e) {
			System.out.println("Exception occured");
		}
	}

}
