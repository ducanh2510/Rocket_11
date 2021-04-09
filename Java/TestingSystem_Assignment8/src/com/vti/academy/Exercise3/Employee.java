package com.vti.academy.Exercise3;

import java.util.ArrayList;
import java.util.List;

public class Employee<T> {
	private int id;
	private String name;
	private List<T> salaries;
	
	public Employee() {
		salaries = new ArrayList<>(); 
	}
	
	public void printLastEmployee() {
		String result = "\nID: " + id	
						+ "\nName: " + name
						+ "\nLastSalary: "
						+ salaries.get(salaries.size() - 1);
		System.out.println(result);
	}
	
	public void print() {
		String result = "\nID: " + id	
						+ "\nName: " + name
						+ "\nSalaries: ";
		for(T salary: salaries) {
			result += "-" + salary;
		}
		System.out.println(result);
	}
	
}
