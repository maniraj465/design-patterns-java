package com.practice.utils;

import java.util.Comparator;

import com.practice.collections.beans.Emp;

public class SortEmpByName implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
