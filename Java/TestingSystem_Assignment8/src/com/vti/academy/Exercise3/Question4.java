package com.vti.academy.Exercise3;

public class Question4<E> {
	private int arrInt[] = { 3, 4, 5, 6, 7, 8, 9 };
	private float arrFloat[] = { 3.3f, 4.4f, 4.5f, 6.4f };
	private double arrDouble[] = { 3.3, 4.4, 4.5, 6.4 };

	public void printArr(E ...arrs) {
		for(E arr: arrs) {
			System.out.println(arr);
		}
    }

}
