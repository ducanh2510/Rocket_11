package com.vti.academy.entity;

import java.util.Scanner;

public class NhanVien extends CanBo{
	private String congViec;
	private Scanner scanner;
	
	public NhanVien() {
		scanner = new Scanner(System.in);
		inputInfo();
	}

	public String getCongViec() {
		return congViec;
	}

	public void inputInfo() {
		super.inputInfo();
		System.out.println("Moi ban nhap cong viec: ");
		congViec = scanner.nextLine();
	}

}
