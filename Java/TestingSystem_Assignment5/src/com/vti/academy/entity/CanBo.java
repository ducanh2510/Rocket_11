package com.vti.academy.entity;

import java.util.Scanner;

public abstract class CanBo {
	protected String name;
	protected int age;
	protected boolean isMale;
	protected String address;
	private Scanner scanner;

	@Override
	public String toString() {
		String result = "";
		result += "Name: " + getName() + "\t"
				+ "Age: " + getAge() + "\t"
				+ "Gender: " + (isMale() ? "Nam": "Nu") + "\t"
				+ "Address: " + getAddress();
		return result;
	}
	
	public CanBo() {
		scanner = new Scanner(System.in);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean isMale() {
		return isMale;
	}

	public String getAddress() {
		return address;
	}
	
	public void inputInfo() {
		System.out.println("Moi ban nhap ten can bo: ");
		name = scanner.nextLine();
		System.out.println("Moi ban nhap tuoi: ");
		age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Moi ban nhap gioi tinh nam/nu?");
		String gender = scanner.nextLine();
		isMale = gender.equals("nam") ? true: false;
		System.out.println("Moi ban nhap dia chi: ");
		address = scanner.nextLine();
	}

}
