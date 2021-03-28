package com.vti.academy;
import java.util.Scanner;

public class String_04 {
	public static void countWord() {
		String strs = "  Hello moi nguoi minh   la dev   ";
		strs = strs.trim();
		String str[] = strs.split("\\s+");
		int length = str.length;
		System.out.println(length);
	}
	
	// Question 2
	public static void question2() {
		String s1 = "Xin chao";
		String s2 = "cac ban";
		System.out.println(s1 + s2);
	}
	
	// Question 3
	public static void question3() {
		Scanner scanner = new Scanner(System.in);
		String fullname;
		System.out.println("Moi nhap ten cua ban: ");
		fullname = scanner.nextLine();
		
	}
	
	// Question 4
	public static void question4() {
		Scanner scanner = new Scanner(System.in);
		String name;
		System.out.println("Moi nhap ten cua ban: ");
		name = scanner.nextLine();
		int length = name.length();
		for(int i = 0; i < length; i++) {
			System.out.printf("Ky tu thu %d la %s\n", i + 1, name.charAt(i));
		}
	}
	
	// Question 5
	public static void question5() {
		Scanner scanner = new Scanner(System.in);
		String firstname, lastname;
		System.out.println("Moi nhap ho cua ban: ");
		firstname = scanner.nextLine();
		System.out.println("Moi nhap ten cua ban: ");
		lastname = scanner.nextLine();
		System.out.println("Xin chao " + firstname + lastname);
	}
	
	// Question 6
	public static void question6() {
		Scanner scanner = new Scanner(System.in);
		String fullname;
		System.out.println("Moi nhap ten cua ban:");
		fullname = scanner.nextLine();
		String[] miniNameArr = fullname.split("\\s+");
		if(miniNameArr.length > 3) {
			for(int i = 3; i < miniNameArr.length; i++) {
				miniNameArr[2] += " " + miniNameArr[i];
			}
		}
		System.out.println("Ho la: " + miniNameArr[0]);
		System.out.println("Ten dem la: " + miniNameArr[1]);
		System.out.println("Ten la: " + miniNameArr[2]);
	}
	
	// Question 7
	public static void question7() {
		Scanner scanner = new Scanner(System.in);
		String fullname;
		System.out.println("Moi nhap ten cua ban:");
		fullname = scanner.nextLine();
		fullname = fullname.trim();
		String arrs[] = fullname.split("\\s+");
		fullname = "";
		for(String arr: arrs) {
			fullname += arr.substring(0, 1).toUpperCase() + arr.substring(1) + " ";
		}
		System.out.println("Ten ban la: " + fullname);
	}
	
	// Question 10
	public static void question16() {
		String s1 = "OK";
		String s2 = "KO";
		
		String s1_revert = "";
		
		for(int i = s1.length() - 1; i >= 0; i--){
			s1_revert += s1.charAt(i);
		}
		
		if(s2.equals(s1_revert)) 
			System.out.println("True");
		
		else System.out.println("False");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// question4();
		
		question7();
	}

}




















