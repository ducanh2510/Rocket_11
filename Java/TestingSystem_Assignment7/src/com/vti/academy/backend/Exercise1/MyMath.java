package com.vti.academy.backend.Exercise1;

public class MyMath implements IMyMath{
	public static final float PI = 3.14f;
	
	@Override
	public int min(int... arrs) {
		int min = arrs[0];
		for(int arr: arrs) {
			if(min >= arr) min = arr; 
		}
		return min;
	}
	
	@Override
	public int max(int... arrs) {
		int max = arrs[0];
		for(int arr: arrs) {
			if(max <= arr) max = arr; 
		}
		return max;
	}
	
	@Override
	public int sum(int... arrs) {
		int sum = 0;
		for(int arr: arrs) {
			sum += arr;
		}
		return sum;
	}
	
	public float sum(int a) {
		return a + PI;
	}
	
	
}
