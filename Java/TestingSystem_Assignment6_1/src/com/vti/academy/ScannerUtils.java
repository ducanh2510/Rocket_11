package com.vti.academy;

import java.util.Scanner;

import com.vti.academy.Program5;

public class ScannerUtils implements IScannerUtils {
	
	@Override
	public int inputInt(String errorMessage) {
		Program5 Input = new Program5();
		try {
			Input.input(errorMessage, Input.getTypeData("INT"));
			int intReturn = Input.getIntReturn();
			return intReturn;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public float inputFloat(String errorMessage) {
		Program5 Input = new Program5();
		float floatReturn;
		try {
			Input.input(errorMessage, Input.getTypeData("FLOAT"));
			floatReturn = Input.getFloatReturn();
			return floatReturn;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public double inputDouble(String errorMessage) {
		Program5 Input = new Program5();
		double doubleReturn;
		try {
			Input.input(errorMessage, Input.getTypeData("DOUBLE"));
			doubleReturn = Input.getDoubleReturn();
			return doubleReturn;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public String inputString() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Moi nhap vao gia tri: ");
		String stringReturn = scanner.nextLine();
		return stringReturn;
	}
}
