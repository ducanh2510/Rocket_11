package com.vti.academy.entity;

import java.util.Scanner;

public class KySu extends CanBo{
	private String nganhDaoTao;
	private Scanner scanner;
	
	public KySu() {
		scanner = new Scanner(System.in);
		inputInfo();
	}

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}
	
	public void inputInfo() {
		super.inputInfo();
		System.out.println("Moi ban nhap nganh dao tao: ");
		nganhDaoTao = scanner.nextLine();
	}
	
}
