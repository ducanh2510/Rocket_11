package com.vti.academy.entity;

import java.util.Scanner;

public abstract class ThiSinh {

	protected int sbd;
	protected char khoi;
	private String diaChi;
	private String hoTen;
	private int mucUuTien;
	protected String[] cacMon;

	private Scanner scanner;

	public ThiSinh() {
		scanner = new Scanner(System.in);
		inputInfo();
		
	}

	public int getSbd() {
		return sbd;
	}

	public void inputInfo() {
		System.out.println("Moi ban nhap so bao danh: ");
		sbd = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Moi ban nhap ten: ");
		hoTen = scanner.nextLine();
		System.out.println("Moi ban nhap dia chi: ");
		diaChi = scanner.nextLine();
		System.out.println("Moi ban nhap muc uu tien: ");
		mucUuTien = scanner.nextInt();
		scanner.nextLine();
	}
	
	public void showInfo() {
		System.out.println("SBD: " + sbd
							+ "\nHo Ten: " + hoTen
							+ "\nDia Chi: " + diaChi
 							+ " \nKhoi: " + khoi);
	}

}
