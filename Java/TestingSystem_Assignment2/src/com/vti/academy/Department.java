package com.vti.academy;

public class Department {
	int id;
	String departmentName;
	@Override
	public String toString() {
		String result;
		result = "ID: " + id + "\n"
				+ "DepartmentName" + departmentName + "\n";
		return result;
	}
}
