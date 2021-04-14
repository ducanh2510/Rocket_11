package com.vti.academy.Exercise4;

public class Salary<N extends Comparable<Number>> {
	private N salary;
	
	public void printSalary() { 
		System.out.println(salary);
	}
	
}
