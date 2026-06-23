package day9;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
/*
 * ArrayList  - class which implement List interface
 * Store multiple sets of data
 * CRUD
 * Creation - add(num)
 * Retrival - get(index) 
 * Update - set(index,num)
 * Delete - remove()
 * 
 * It maintains the insertion order
 * duplicate values are allowed into an array list
 * null values as well accepted
 * index starts from zero
 */
	public static void main(String[] args) {
		//ArrayList<Integer> al = new ArrayList();
		List<Integer> al =new ArrayList();	
		al.add(12);
		al.add(32);
		al.add(67);
		al.add(12);
		al.add(null);
		//System.out.println(al);
		
//		System.out.println(al.get(0));//12
//		System.out.println(al.get(1));//32
//		System.out.println(al.get(2));//67
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println(al.get(2));//67
		al.set(2, 100);
		System.out.println(al.get(2));//100
		
		System.out.println(al);//[12,32,100,12,null]
		
		
		al.remove(2);
		System.out.println(al);//[12,32,12, null]
		
		
		System.out.println(al.contains(100));//false
		
		al.clear();//[]
		System.out.println(al);
		
	
	}

}
