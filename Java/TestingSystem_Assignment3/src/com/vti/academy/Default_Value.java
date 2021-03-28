package com.vti.academy;

public class Default_Value {

	public static void main(String[] args) {
		Account[] accounts = new Account[5];
		for(int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account();
			accounts[i].Email = "Email " + (i + 1);
			accounts[i].Username = "Username " + (i + 1);
			accounts[i].Fullname = "Fullname " + (i + 1);
		}
		
//		for(int i = 0; i < accounts.length; i++){
//			System.out.println(accounts[i].Email);
//			System.out.println(accounts[i].Username);
//			System.out.println(accounts[i].Fullname);
//		}
		
		
	}
}
