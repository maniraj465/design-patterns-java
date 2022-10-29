package com.practice.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.practice.collections.beans.Emp;
import com.practice.utils.SortEmpByEmpId;
import com.practice.utils.SortEmpByName;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1,2,3));
		System.out.println("al1 : " + al);
		al.add(5);
		System.out.println("al1 : " + al);
		al.add(3, 4);
		System.out.println("al1 : " + al);
		
		ArrayList<String> al1 = new ArrayList<String>(List.of("one", "two", "three"));
		System.out.println("al1 : " + al1);
		
		ArrayList<String> al2 = new ArrayList<String>(al1);
		System.out.println("al2 : " + al2);
		al2.remove(1);
		System.out.println("al2 : " + al2);
		System.out.println("al1 : " + al1);
		
		System.out.println("al1 isEmpty : " + al1.isEmpty());
		
		
		System.out.println("al1 : " + al.size());
		System.out.println("al1 contains(3) : " + al.contains(3));
		Integer[] arr = new Integer[al.size()];
		arr = al.toArray(arr);
		for (Integer x : arr) 
            System.out.print(x + " ");
		
		al.add(2);
		System.out.println("al lastIndexOf 2 : " + al.lastIndexOf(2));
		
		for (int i =0; i < al.size(); i++) {
			System.out.print(al.get(i) + " ");
		}
		System.out.println();
		Iterator<String> irStr = al1.iterator();
		while (irStr.hasNext()) {
			System.out.println(irStr.next());
		}
		final var newVar = 21;
		System.out.println(newVar);
		
		System.out.println("before al1.trimToSize() : " + al.size());
		al.trimToSize();
		System.out.println("after al1.trimToSize() : " + al.size());
		Collections.sort(al1);
		System.out.println(al1);
		ArrayList<Emp> empList = new ArrayList<>();
		empList.add(new Emp(1, "Maniraj"));
		empList.add(new Emp(2, "Ramya"));
		empList.add(new Emp(3, "Balu"));
		
		for (var emp : empList) {
			System.out.println("Emp Id : " + emp.getEmpId() + " Emp name : " + emp.getName());
		}
		
		Collections.sort(empList, new SortEmpByName());
		System.out.println("After sort by name");
		for (var emp : empList) {
			System.out.println("Emp Id : " + emp.getEmpId() + " Emp name : " + emp.getName());
		}
		
		Collections.sort(empList, new SortEmpByEmpId());
		System.out.println("After sort by EmpId");
		for (var emp : empList) {
			System.out.println("Emp Id : " + emp.getEmpId() + " Emp name : " + emp.getName());
		}
		
		
		
	}

}
