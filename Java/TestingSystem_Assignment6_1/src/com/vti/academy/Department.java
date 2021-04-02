package com.vti.academy;

public class Department{
	private float id;
	private String name;
	private ScannerUtils scannerUtils;
	
	public Department() {
		scannerUtils = new ScannerUtils();
		System.out.println("ID");
		id = scannerUtils.inputFloat("Loi roi");
		System.out.println("Name");
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
