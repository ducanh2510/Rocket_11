package com.vti.academy.Exercise1;

public class Student_new {
	private int id;
	private String name;
	public static int count = 0;
	
	public Student_new() {
		count++;
		this.id = count;
	}
	
	@Override
	public String toString() {
		String result = "\nID: " + id
						+ "\nName: " + name;
		return result;
	}
}
