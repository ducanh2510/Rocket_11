package com.vti.academy;

public class Method {

	// Question 1
		public static void getNumber() {
			for(int i = 2; i < 10; i += 2) {
				System.out.printf("%d\n", i);
			}
		}
		
		// Question 2
		public static void getAccount(Account ...accounts) {
			for(Account account: accounts) {
				account.toString();
			}
		}
		
		// Question 3
		public static void getNumber2() {
			for(int i = 1; i < 10; i++) {
				System.out.printf("%d\n", i);
			}
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			// getNumber2();
		}

}
