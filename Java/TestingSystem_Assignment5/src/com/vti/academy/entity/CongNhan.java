package com.vti.academy.entity;

import java.util.Scanner;

public class CongNhan extends CanBo{
	private int bac;
	private Scanner scanner;
	
	public CongNhan() {
		scanner = new Scanner(System.in);
		inputInfo();
	}

	public int getBac() {
		return bac;
	}

	public void inputInfo() {
		super.inputInfo();
		System.out.println("Moi ban nhap bac cua cong nhan: ");
		bac = scanner.nextInt();
	}

}
