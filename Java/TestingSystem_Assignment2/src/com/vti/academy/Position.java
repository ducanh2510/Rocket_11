package com.vti.academy;

public class Position {
	int id;
	String positionName;
	
	@Override
	public String toString() {
		String result;
		result = "ID: " + id + "\n"
				+ "PositionName" + positionName + "\n";
		return result;
	}
}
