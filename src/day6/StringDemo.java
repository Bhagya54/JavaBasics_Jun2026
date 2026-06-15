package day6;

public class StringDemo {
/*String is immutable - cannot change the value
 *  Stores sequence of characters
 * 
 * String Literal - String str = "value1"
 * using a new keyword - 
 * 
 */
	public static void main(String[] args) {
		String str = "Hello";
		str=str.concat(" World");
		System.out.println(str);//Hello World
		
		String str2 = new String("selenium");
		System.out.println(str2);
		
		
		String sl1 = "java";
		String sl2 = "python";
		String sl3 = "java";
		
		int a1=100;
		int a2=100;
		System.out.println(a1==a2);//true
		
		System.out.println(sl1==sl2);//false
		System.out.println(sl1==sl3);//true
		//whether both references are pointing to the same object or not
		
		
		String sn1=new String("TeA");
		String sn2=new String("coffee");
		String sn3=new String("tea");
		
		System.out.println(sn1==sn3);//false
		
	
		System.out.println(sn1.equals(sn3));//false
		System.out.println(sn1.equalsIgnoreCase(sn3));//true
		
		System.out.println(str.length());
		System.out.println(str.charAt(4));//o
		
		String replacedString=str.replace('l','3');
		String capitalString=replacedString.toUpperCase();
		System.out.println(capitalString);
		
		//Method Chaining 
		System.out.println(str.replace('l','3').toUpperCase());
		
		
		System.out.println(str.contains("lo W"));//true
		System.out.println(str.endsWith("rld"));//true
		System.out.println(str.startsWith("Hello"));//true
		
		System.out.println(str.indexOf("W"));//6
		String st1="";
		String st2="  ";
		
		System.out.println(st2.isEmpty());//false
		System.out.println(st2.isBlank());//true
		
		//Hello World
		System.out.println(str.substring(6,11));
		System.out.println(str.substring(4));
		
		//reverse of a string
		//selenium - muineles - 8
		String s1="selenium";
		String revString="";
		for(int i=s1.length()-1;i>=0;i--) {//0>=0
			//revString = revString + s1.charAt(i);
			revString += s1.charAt(i);//""+m -> muineles
		}
		
		System.out.println(revString);
		
		//Verify whether the 2 string palindrome
		//actual string == reversed string
		
		if(s1.equals(revString)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		
		//String Buffer is mutable -
		StringBuffer sb = new StringBuffer("pallavi");
		sb.append("- student");
		System.out.println(sb);
		System.out.println(sb.reverse());
	}

}
