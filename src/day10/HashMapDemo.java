package day10;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
/*
 * HashMap  - class implements Map interface
 * key and value(1,"abc")
 * entry,pair,bucket
 * set of entries - entry set
 * Hashing Mechanism - order of insertion is not maintained
 * Can we have duplicate values? yes
 * Can we have duplicate keys? No, it acts a updation
 * 
 * CRUD 
 * add - put()
 * duplicate key - update 
 * retrieving - get(key) - value
 * delete - remove(key) - entry gets deleted
 */
public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(1,"Tina");
		hm.put(12,"Rina");
		hm.put(23,"phani");
		hm.put(16,"phani");
		hm.put(23,"bharath");
		
		System.out.println(hm);
		
		Set<Integer> keys = hm.keySet();
		System.out.println(keys);
		
		Collection<String> values = hm.values();
		System.out.println(values);
		
		for(Entry<Integer,String> e:hm.entrySet()) {
			System.out.println(e.getKey() + "->" + e.getValue());
		}
		
		System.out.println(hm.get(12));//Rina
		hm.remove(16);
		System.out.println(hm);
	}

}
