package com.vti.academy;

public class Department{
	private int id;
	private String name;
	private ScannerUtils scannerUtils;
	
	public Department() {
		scannerUtils = new ScannerUtils();
		System.out.println("ID Department");
		id = scannerUtils.inputInt("Loi roi");
		System.out.println("Name Department");
		name = scannerUtils.inputString();
	}

	public float getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		String result = "ID: " +  getId() 
					   + "\nName: " + getName();
		return result;
	}
}
