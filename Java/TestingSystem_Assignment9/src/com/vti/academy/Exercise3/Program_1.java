package com.vti.academy.Exercise3;

import java.util.ArrayList;
import java.util.List;

public class Program_1 {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(3);
		arr.add(6);
		arr.add(8);
		arr.add(9);
		arr.add(10);
		arr.add(11);
		arr.add(15);
		arr.add(16);
		int a = 4;
		for(int i = 0; i < arr.size(); i++) {
			if(a > arr.get(i)) continue;
			else { 
				for(int j = i + 1; j <= arr.size(); j++) {
					
				}
			}
		}
		for(int i: arr) {
			System.out.println(a);
		}
	}
}
