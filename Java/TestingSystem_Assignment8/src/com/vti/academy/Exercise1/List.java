package com.vti.academy.Exercise1;

import java.util.ArrayList;

public class List {
	private java.util.List<Student_new> students;
	
	public List() {
		students = new ArrayList<>();
	}
	
	public void sizeList() {
		System.out.println(students.size());
	}
	
	public Student_new getStudent(int index) { 
		return students.get(index);
	}
	
	public void getFirstAndLastStudent() { 
		System.out.println(getStudent(0).toString());
		System.out.println(getStudent(students.size() - 1).toString());
	}
	
	public void insertFirstArray() {
		
	}
	
	public void insertLastArray() {
		
	}
	
}
