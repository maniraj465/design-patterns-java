package com.practice.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		
		char[] ch = {'a', 'b', 'c', 'a', 'c', 'd', 'e', 'e', 'f', 'b'};
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (char c : ch) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}
		System.out.println((char) 'a' - 97);
		
		System.out.println(hm);
		System.out.println(hm.entrySet());
		
		for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
		
		System.out.println();
		
		for (var entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
		String name = new String("Maniraj");
		if (name instanceof String)
			System.out.println("Yes its a String object");
		if ((Character)'a' instanceof Character)
			System.out.println("Yes its a Character object");
		
		hm.forEach((c, count) -> {
			System.out.println("Char : " + c + " Occurrance : " + count);
		});
		
		Map<Integer, String> customers = new HashMap<>();
		customers.put(1, "Ajay");
		customers.put(2, "Barkha");
		customers.put(3, "Cathy");
		 
		System.out.println("Using foreach");
		customers.forEach((id, uname) -> {
		System.out.println("Key : " + id + " value : " + uname);
		});
		
		ArrayList<String> customersList = new ArrayList<>();
		customersList.add("Ajay");
		customersList.add("Barkha");
		customersList.add("Cathy");
		 
		System.out.println("Using foreach");
		customersList.forEach((uName) -> {
		System.out.println("Name : " + uName);
		});
	}

}
