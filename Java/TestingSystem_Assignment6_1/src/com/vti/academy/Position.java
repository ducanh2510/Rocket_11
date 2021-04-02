package com.vti.academy;

public class Position{
	private int id;
	private String name;
	private ScannerUtils scannerUtils;
	
	public Position() {
		scannerUtils = new ScannerUtils();
		System.out.println("ID Position");
		id = scannerUtils.inputInt("Loi roi");
		System.out.println("Name Position");
		name = scannerUtils.inputString();
	}

	public int getId() {
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
