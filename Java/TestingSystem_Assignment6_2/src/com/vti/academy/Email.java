package com.vti.academy;

import java.util.Scanner;

public class Email {
	public static void main(String[] args) {
		checkEmail();
	}
	
	public static void checkEmail() {
		Scanner scanner = new Scanner(System.in);
		String email = "";
		while(true) {
			System.out.print("Moi ban nhap email: ");
			email = scanner.nextLine();
			if(email.length() < 5) {
				System.err.println("Loi roi");
			}else {
				int count = 0;
				for(int i = 0; i < email.length(); i++) {
					if(email.charAt(i) == '@') count++;
				}
				if(count == 0 || count > 1) {
					System.err.println("Loi roi");
				}else {
					System.out.println("Thanh cong!");
					return;
				}
			}			
		}
		
	}
	
}
