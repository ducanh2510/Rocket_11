package com.vti.academy;

import java.util.Date;

public class Account {
	private int id;
	private String email, fullname, username;
	private Department departmentID;
	private Position positionID;
	// private Date createDate;
	private ScannerUtils scannerUtils;
	
	public Account() {
		scannerUtils = new ScannerUtils();
		System.out.println("ID Account");
		id = scannerUtils.inputInt("Loi roi");
		System.out.println("Email Account");
		email = scannerUtils.inputString();
		System.out.println("Fullname Account");
		fullname = scannerUtils.inputString();
		System.out.println("Username Account");
		username = scannerUtils.inputString();
		System.out.println("Department Account");
		departmentID = new Department();
		System.out.println("Position Account");
		positionID = new Position();
	}
	
	@Override
	public String toString() {
		String result = "ID: " + getId()
					   + "\nEmail: " + getEmail()
					   + "\nUsername: " + getUsername()
					   + "\nFullname: " + getFullname() + "\n"
					   + departmentID.toString() + "\n"
					   + positionID.toString() + "\n"; 
		return result;
	}

	public int getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getFullname() {
		return fullname;
	}

	public String getUsername() {
		return username;
	}

	public Department getDepartmentID() {
		return departmentID;
	}

	public Position getPositionID() {
		return positionID;
	}

	public ScannerUtils getScannerUtils() {
		return scannerUtils;
	}
}
