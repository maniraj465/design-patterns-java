package com.practice.collections;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(1, 2);
		System.out.println(ll);
		
		
		
		
		
		
		StringBuilder str = new StringBuilder();
		  
        // print string capacity
        System.out.println("Before ensureCapacity "
                           + "method capacity = "
                           + str.capacity());
  
        // apply ensureCapacity()
        str.ensureCapacity(18);
     // print string capacity
        System.out.println("After ensureCapacity"
                           + " method capacity = "
                           + str.capacity());
		
	}

}
