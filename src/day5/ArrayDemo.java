package day5;

public class ArrayDemo {
/*Array - used for storing multiple values of same datatype.
 * Structure:
 * 1.Declaration
 * 2.Instantiation
 * 3.Initialization
 * size - no of values that we want to store inside this array
 * Rules:
 * 1. We should tell the array size as part of instantiation at the beginning itself
 * 2. Index always starts from zero(0)
 * 3. Duplicate values are allowed
 * 4. length method can be used to get the size of an array
 * 5. If we don't initialize the array index value,
 * Java will automatically initializes with a default value based on the data type
 */
	public static void main(String[] args) {
//		int[] arr1;//1.Declaration
//		arr1=new int[5];//2.Instantiation
		
		int[] arr2 = new int[5];//Declaration+instantiation
		arr2[0]=23;
		arr2[1]=56;
		arr2[2]=78;
		arr2[4]=56;
		
//		System.out.println(arr2[0]);
//		System.out.println(arr2[1]);//56
//		System.out.println(arr2[2]);
		
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
		
		String[] names = new String[4];
		names[0]="karan";
		names[1]="tina";
		names[2]="raj";
		
		//System.out.println(names[3]);//null
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		
		char[] grades = {'2','3','1'};//declaration+initialization
		for(int i=0;i<grades.length;i++) {
			System.out.println(grades[i]);
		}
		
		
		
	}

}
