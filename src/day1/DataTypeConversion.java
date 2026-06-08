package day1;

public class DataTypeConversion {
	
	/*
	 * B1: 5l container - 1l water 
	 * B2: 2l
	 * 
	 * Task 1 : B2 >B1 - possible
	 * Task 2: B1 > B2 - there is chances water loss
	 * 
	 */

	public static void main(String[] args) {
		
		int i1=12;
		byte b1=(byte) i1;
		System.out.println(i1);//12
		System.out.println(b1);//12
		
		
		long l1=234;
		int i2=(int) l1;
		System.out.println(l1);//234
		System.out.println(i2);//234
		
		byte b2=56;
		int i3=b2;
		System.out.println(b2);
		System.out.println(i3);
		
		int i4=67;
		float f1=i4;
		System.out.println(i4);//67
		System.out.println(f1);//67.0
		
		float f2 = 12.76f;
		short s1=(short) f2;
		System.out.println(f2);//12.56
		System.out.println(s1);//12
		
		char c1='a';
		int i5=c1;
		System.out.println(c1);//a
		System.out.println(i5);//97
		
		
		int i6=114;
		char c2=(char) i6;
		System.out.println(i6);//114
		System.out.println(c2);//r
		
		String str1="123";
		int i7=Integer.parseInt(str1);
		System.out.println(str1+1);//1231
		System.out.println(i7+1);//124
		
		
		float ff1=23.67f;
		String str2=Float.toString(ff1);
		System.out.println(ff1+10);
		System.out.println(str2+10);
		
		String str3 = "shdjksahdj";
		int i8=Integer.parseInt(str3);
		
		//NumberFormatException
				
		
		

	}

}
