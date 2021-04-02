package com.vti.academy;

import java.util.Scanner;

public class String_Method {
	public static Scanner scanner = new Scanner(System.in);

	// Question 1
	public static void question1() {
		System.out.println("Moi nhap vao ten: ");
		String name = scanner.nextLine();
		String[] name_split = name.split("\\s+");
		name = "";
		for (int i = 0; i < name_split.length; i++) {
			name += name_split[i].substring(0, 1).toUpperCase() + name_split[i].substring(1) + " ";
		}
	}

	// Question 2
	public static void question2() {
		System.out.println("Moi nhap vao xau: ");
		String str = scanner.nextLine();
		int count = 0;
		System.out.println("Vi tri xuat hien cua ki tu a la: ");
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a')
				count++;
			System.out.print(i + " ");
		}
		System.out.println("So lan xuat hien ki tu a la: " + count);
	}

	// Question 34
	public static void question34() {
		System.out.println("Moi nhap vao xau: ");
		String str = scanner.nextLine();
		System.out.println("Moi nhap vao ki tu bi thay: ");
		String x = scanner.nextLine();
		System.out.println("Moi nhap vao ki tu thay the: ");
		String y = scanner.nextLine();
		str = str.replace(x, y);
		System.out.println("Chuoi sau khi thay the la: " + str);
	}

	// Question 5
	public static void question5() {
		System.out.println("Moi nhap vao chuoi: ");
		String str = scanner.nextLine();
		int[] countArr = new int[10];
		for(int i = 0; i < 10; i++) {
			countArr[i] = 0; 
		}
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= '0' && str.charAt(i) <= '9' ) {
				countArr[str.charAt(i) - 48] ++;
			}
		}
		for(int i = 0; i < 10; i++) {
			if(countArr[i] != 0) {
				System.out.println("Ki tu " + i + " xuat hien " + countArr[i] + " lan");
			}
		}
	}

	// Question 6
	public static void question6() {
		String str = "Java - Noi tri tuong duoc bay xa";
		String[] strSplit = str.split(" ");
		for(int i = 0; i < strSplit.length; i++) {
			System.out.printf("strSplit[%d] = %s\n", i, strSplit[i]);
		}
	}

	// Question 7
	public static void question7() {
		final String username = "CoderTraiGang";
		final String password = "123455";
		String userInput, passInput;
		boolean logIn = false;
		do {
			System.out.println("Moi nhap username: ");
			userInput = scanner.nextLine();
			System.out.println("Moi nhap password: ");
			passInput = scanner.nextLine();
		}while(userInput != username || passInput != password);
	}

	public static void main(String[] args) {
		question6();
	}

}
