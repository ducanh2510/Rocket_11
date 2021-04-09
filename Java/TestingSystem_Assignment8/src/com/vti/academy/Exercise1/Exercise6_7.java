package com.vti.academy.Exercise1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Exercise6_7 {
	public static void main(String[] args) {
		Map<Integer, String> students = new HashMap<>();
		students.put(1, "Nguyen Van Nam");
		Set<Integer> set = students.keySet();
		for (Integer key : set) {
			System.out.println(students.get(key));
		}
		
	}
}
