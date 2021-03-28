package com.vti.academy;
import java.util.Scanner;

public class Input_From_console {

	// Question 1
	public static void question1() {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[3];
		for(int i = 0; i < 3; i++) {
			arr[i] = scanner.nextInt();
		}
	}

	// Question 2
	public static void question2() {
		Scanner scanner = new Scanner(System.in);
		float[] arr = new float[2];
		for(int i = 0; i < 2; i++) {
			arr[i] = scanner.nextFloat();
		}
	}
	
	// Question 3
	public static void question3() {
		Scanner scanner = new Scanner(System.in);
		String fullname = "";
		fullname = scanner.nextLine();
		System.out.println("" + fullname);
	}
	
	// Question 4
	public static void question4() {
		Scanner scanner = new Scanner(System.in);
		String dateOfBirth;
		dateOfBirth = scanner.nextLine();
	}
	
	// Question 5
	public static Account createAccount() {
		Scanner scanner = new Scanner(System.in);
		Account account = new Account();
		System.out.println("Moi nhap ma so account: ");
		account.id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Moi nhap email: ");
		account.email = scanner.nextLine();
		System.out.println("Moi nhap username: ");
		account.username = scanner.nextLine();
		System.out.println("Moi nhap fullname: ");
		account.fullname = scanner.nextLine();
		System.out.println("Moi nhap ma so position: ");
		int option = scanner.nextInt();
		Position position = new Position();
		switch(option) {
		case 1:
			position.id = 1;
			position.positionName = "Position.DEV";
			account.positionID = position;
			break;
		case 2:
			position.id = 2;
			position.positionName = "Position.Test";
			account.positionID = position;
			break;
		case 3:
			position.id = 2;
			position.positionName = "Position.ScrumMaster";
			account.positionID = position;
			
			break;
		case 4:
			position.id = 2;
			position.positionName = "Position.PM";
			account.positionID = position;
			break;
		case 5:
			position.id = 2;
			position.positionName = "Position.PM";
			account.positionID = position;
			break;
		}
		return account;
	}
	
	// Question 6
	public static Department createDepartment() {
		Scanner scanner = new Scanner(System.in);
		Department department = new Department();
		System.out.println("Moi nhap ma so department: ");
		department.id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Moi nhap ten department: ");
		department.departmentName = scanner.nextLine();
		return department;
	}
	
	// Question 7
	public static void question7() {
		Scanner scanner = new Scanner(System.in);
		int number;
		do {
			System.out.println("Moi nhap so: ");
			number = scanner.nextInt();
		}while(number % 2 != 0);
	}
	
	// Question 8
	public static void question8() {
		int option;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Moi nhap lua chon: ");
			System.out.println("1. Tao account");
			System.out.println("2. Tao department");
			option = scanner.nextInt();
			switch(option) {
			case 1:
				createAccount();
				break;
			case 2:
				createDepartment();
				break;
			}
		}while(option != 1 || option != 2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// question3();
		question8();
	}

}
