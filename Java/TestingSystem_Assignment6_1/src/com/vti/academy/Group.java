package com.vti.academy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Group {
	private int id;
	private String name;
	private int creatorID;
	// private Date createDate;
	private List<Account> accounts;
	private ScannerUtils scannerUtils;
	private Scanner scanner;
	
	public Group(){
		scanner = new Scanner(System.in);
		accounts = new ArrayList<>();
		scannerUtils = new ScannerUtils();
		System.out.println("ID Group");
		id = scannerUtils.inputInt("Loi roi");
		System.out.println("Name Group");
		name = scannerUtils.inputString();
		System.out.println("CreatorID");
		creatorID = scannerUtils.inputInt("Loi roi");
		System.out.println("Accounts");
		String option = "Y";
		while(option == "Y") {
			Account acount = new Account();
			accounts.add(acount);
			System.out.print("Ban con muon tiep tuc them account khong Yes/No?(Y\\N): ");
			option = scanner.nextLine();
		}
	}
	
	@Override
	public String toString() {
		String result = "ID: " + getId()
					   + "\nName: " + getCreatorID()
					   + "\nCreatorID: " + getCreatorID() + "\n";
		for(Account account: accounts) {
			result += account.toString();
		}
		return result;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getCreatorID() {
		return creatorID;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public ScannerUtils getScannerUtils() {
		return scannerUtils;
	}

	public Scanner getScanner() {
		return scanner;
	}
}
