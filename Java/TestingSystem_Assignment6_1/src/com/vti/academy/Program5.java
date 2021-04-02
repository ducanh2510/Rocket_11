package com.vti.academy;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Program5 {
	private int intReturn;
	private float floatReturn;
	private double doubleReturn;
	private enum typeData{
		INT, FLOAT, DOUBLE;
	}
	
	public typeData getTypeData(String type) {
		switch (type) {
		case "INT":
			return typeData.INT;
		case "FLOAT":
			return typeData.FLOAT;
		case "DOUBLE":
			return typeData.DOUBLE;
		default:
			return null;
		}
	}
	
	public int inputInteger() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("Moi nhap vao gia tri: ");
			try {
				int age = scanner.nextInt();
				return age;
			} catch (InputMismatchException e) {
				System.out.println("wrong inputing! Please input an value as int, input again");
				scanner.nextLine();
			}
		}
	}
	
	public float inputFloat() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("Moi nhap vao gia tri: ");
			try {
				float floatReturn = scanner.nextFloat();
				return floatReturn;
			} catch (InputMismatchException e) {
				System.out.println("wrong inputing! Please input an value as float, input again");
				scanner.nextLine();
			}
		}
	}
	
	public double inputDouble() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("Moi nhap vao gia tri: ");
			try {
				double floatDouble = scanner.nextFloat();
				return floatDouble;
			} catch (InputMismatchException e) {
				System.out.println("wrong inputing! Please input an value as double, input again");
				scanner.nextLine();
			}
		}
	}
	
	public void input(String errorMessage, typeData type) throws Exception{
		switch (type) {
		case INT:
			int intReturn = inputInteger();
			if(intReturn < 0) {
				throw new Exception(errorMessage);
			}else {
				this.intReturn = intReturn;
			}
			break;
		case FLOAT:
			float floatReturn = inputFloat();
			if(floatReturn < 0) {
				throw new Exception(errorMessage);
			}else {
				this.floatReturn = floatReturn;
			}
			break;
		case DOUBLE:
			double doubleReturn = inputDouble();
			if(doubleReturn < 0) {
				throw new Exception(errorMessage);
			}else {
				this.doubleReturn = doubleReturn;
			}
			break;
		default:
			break;
		}
	}

	public int getIntReturn() {
		return intReturn;
	}

	public float getFloatReturn() {
		return floatReturn;
	}

	public double getDoubleReturn() {
		return doubleReturn;
	}
}
