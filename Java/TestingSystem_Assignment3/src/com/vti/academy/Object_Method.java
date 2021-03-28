package com.vti.academy;

public class Object_Method {

	public static void test() {
		Account[] accounts = new Account[5];
		for(int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account();
			accounts[i].Email = "Email " + (i + 1);
			accounts[i].Username = "Username " + (i + 1);
			accounts[i].Fullname = "Fullname " + (i + 1);
		}
	}
	
	// Question 2
	public static void Question2(Account ...accounts) {
		for(Account account: accounts) {
			account.toString();
		}
	}
	
	// Question 6
	public static void Question6() {
		String[] departmentNames = {"Accounting", "Sale", "Waiting room", "Boss of director", "Maketing"};
		for(int i = 0; i < departmentNames.length; i++) {			
			for(int j = i + 1; j < departmentNames.length; j++) {
				if(departmentNames[i].compareTo(departmentNames[j]) >  0) {
					String tmp = departmentNames[i];
					departmentNames[i] = departmentNames[j];
					departmentNames[j] = tmp;
				}
			}
		}
		for(int i = 0; i < departmentNames.length; i++) {
			System.out.printf("%s\n", departmentNames[i]);
		}
	}
	
	// Question 7
	public static void question7() {
		String[] arrDepartmentNames = {"Accounting", "Boss of director", "Marketing", "waiting room", "Sale"};
		String[] arrDepartmentNameReverts = new String[5];
		for(int i = 0; i < arrDepartmentNames.length; i++) {
			String arr[] = arrDepartmentNames[i].split("\\s+");
			for(int j = arr.length - 1; j >= 0; j--) {
				arrDepartmentNameReverts[i] += arr[j]; 
			}
		}
		for(int i = 0; i < arrDepartmentNames.length; i++) {			
			for(int j = i + 1; j < arrDepartmentNames.length; j++) {
				if(arrDepartmentNameReverts[i].compareToIgnoreCase(arrDepartmentNameReverts[j]) >  0) {
					String tmp = arrDepartmentNames[i];
					arrDepartmentNames[i] = arrDepartmentNames[j];
					arrDepartmentNames[j] = tmp;
				}
			}
		}
		for(int i = 0; i < arrDepartmentNames.length; i++) {
			System.out.printf("%s\n", arrDepartmentNames[i]);
		}
	}
	
	public static void main(String[] args) {
		question7();
	}


}
