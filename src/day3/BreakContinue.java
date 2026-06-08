package day3;

public class BreakContinue {

	public static void main(String[] args) {
//		for(int i=1;i<10;i++) {
//			if(i==5) {
//				break;//terminate the loop - come out of the loop
//			}
//			System.out.println(i);//1 2 3 4
//		}

		for(int i=1;i<10;i++) {
			if(i==5) {
				continue;//skip the iteration
			}
			System.out.println(i);//1 2 3 4 6 7 8 9
		}
		
		
	}

}
