package com.vti.academy.entity;

import java.util.Scanner;

public abstract class Person {
	protected String name;
	protected String gender;
	protected String dateOfBirth;
	protected String address;
	
	protected Scanner scanner;
	public Person() {
		scanner = new Scanner(System.in);
	}
	
	public Person(String name, String gender, String dateOfBirth, String address) {
		this.name = name;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void inputInfo() {
		System.out.print("Moi nhap ten: ");
		name = scanner.nextLine();
		System.out.print("Moi nhap gioi tinh: ");
		gender = scanner.nextLine();
		System.out.print("Moi nhap ngay sinh: ");
		dateOfBirth = scanner.nextLine();
		System.out.print("Moi nhap dia chi:");
		address = scanner.nextLine();
	}
	
	public void showInfo() {
		System.out.println("Name: " + name
							+ "\nGender: " + gender
							+ "\nDateOfBirth: " + dateOfBirth
							+ "\nAddress: " + address);		
	}
	
	
}
