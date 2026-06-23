package day10;

import java.util.HashMap;
import java.util.Map.Entry;

public class FrequencyOfCharacters {

	public static void main(String[] args) {
		String st1 = "sahasra";//
		HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
		
		for(int i=0;i<st1.length();i++) {
			Character c1 = st1.charAt(i);//r
			if(hm.containsKey(c1)) {
				hm.put(c1,hm.get(c1)+1);
			}
			else {
				hm.put(c1, 1);
			}
		}
		
		for(Entry<Character,Integer> e:hm.entrySet()) {
			System.out.println(e.getKey() + "->" +e.getValue());
		}
		
		for(Character key:hm.keySet()) {
			System.out.println("Key: " +key  + " Value is: " + hm.get(key));
		}

	}

}
