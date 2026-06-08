package day2;

public class Operators {

	public static void main(String[] args) {
		/*
		 * Unary operator - single operand 
		 * 		>Post/Pre Increment/Decrement
		 * Binary a=12,b=13 - 2 operands
		 * 		>Arithmetic - +,-,*,/ - quotient , % - modulus - remainder
		 * 		>Relational - <,<=,>,>=,== -boolean(true/false)
		 * 		>Logical - && - T T - T,||,!
		 * 
		 * && - T T - T
		 * 		T F  - F
		 * 		F T - F
		 * 		F F - F
		 * 
		 * || - T T - T
		 * 		T F  - T
		 * 		F T - T
		 * 		F F - F
		 * ! - T - F
		 * 	   F - T	
		 * Assignment
		 * Ternary - 3 operands
		 * expr?statement1:statement2
		 */
		
		
		
		System.out.println("Unary Operator");
		int a=10;
		System.out.println(++a);//preincrement- +1 > 11
		System.out.println(a);//11

		
		int b=12;
		System.out.println(b++);//b=12 - 13
		System.out.println(b);//13
		
		int c=16;
		System.out.println(c++ + ++a + b++);//16 + 12 + 13 = 41
		System.out.println(a + " " + b + " " + c);//12 14 17
		
		
		System.out.println(c-- + ++a + b--);//17+ 13 + 14
		System.out.println(a + " " + b + " " + c);//13 13 16
		
		
		System.out.println("Arithmetic Operator");
		int x=10,y=20;
		
		System.out.println(x+y);//30
		System.out.println(y-x);//10
		System.out.println(y/x);//20/10 = 2
		System.out.println(y%x);//0
		
		System.out.println("Relational Operator");
		System.out.println(x<y);//true
		System.out.println(x>=y);//false
		x=20;
		System.out.println(x==y);//true
		
		System.out.println("Logical Operator");
		
		System.out.println(x<y && x==y);//F && T - F
		System.out.println(x<y || x==y);//T
		System.out.println(!(x<y || x==y));//T-F
		
		System.out.println("smallest of 2 numbers");
		int p=21,q=30;
		System.out.println(p<q?"p is the smallest":"q is the smallest");
		
		int r=19;
		System.out.println("smallest of 3 numbers");
		System.out.println(p<q && p<r?"p is the smallest":(q<r?"q is the smallest":"r is the smallest"));
		
		
		
	}

}
