package day11;

public class TwoDArray {

	public static void main(String[] args) {
		//Single dim array
//		int[] arr1 = new int[2];
//		arr1[0]=23;
//		arr1[1]=56;
		//for(int i=0;i<arr1.length;i++){
//		syso(arr1[i])
//	}
		
		//2D Array
		int[][] id = new int[3][2];
		id[0][0]=12;
		id[0][1]=13;
		
		id[1][0]=22;
		id[1][1]=33;
		
		id[2][0]=52;
		id[2][1]=53;
		
		for(int row=0;row<id.length;row++)//row=3<3
		{
			for(int col=0;col<id[row].length;col++) {//col=2<2
				System.out.print(id[row][col] + " ");//id[2][1] => 12 13
																// 22 33 
																// 52 53
				
			}
			System.out.println();
		}

	}

}
