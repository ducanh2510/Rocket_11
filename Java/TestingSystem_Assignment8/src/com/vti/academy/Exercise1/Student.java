package com.vti.academy.Exercise1;

import java.util.HashSet;
import java.util.Set;

public class Student {
	private int id;
	private String name;
	
//	private Set<Student> students;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public static void main(String[] args) {
		Set<Student> students = new HashSet<>();
		students.add(new Student(1, "Nguyen Van Nam"));
		students.add(new Student(2, "Nguyen Van A"));
		students.add(new Student(3, "Tran Van Nam"));
		students.add(new Student(4, "Nguyen Dinh Minh"));
	}
	
	
}
