package day9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
/*
 * HashSet -class which implements Set interface
 * Duplicate values are not allowed 
 * insertion order is not maintained
 * Hashing mechanism - 
 * 
 * 
 */
	public static void main(String[] args) {
		Set<String> s1 = new HashSet<>();
		s1.add("abc");
		s1.add("xyz");
		s1.add("abc");
		s1.add(null);
		s1.add(null);
		System.out.println(s1);
		
		for(String s:s1) {
			System.out.println(s);
		}
		
		System.out.println("Using iterator");
		
		Iterator<String> it = s1.iterator();
		//hasNext() - verifies are there any more values to iterate
		//next()
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
