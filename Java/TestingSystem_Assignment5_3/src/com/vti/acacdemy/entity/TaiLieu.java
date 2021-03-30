package com.vti.acacdemy.entity;

import java.util.Scanner;

public abstract class TaiLieu {
	private String maTaiLieu;
	private String tenNXB;
	private int soBan;
	
	private Scanner scanner;
	
	public TaiLieu() {
		scanner = new Scanner(System.in);
	}
	
	public String getMaTaiLieu() {
		return maTaiLieu;
	}
	public void setMaTaiLieu(String maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}
	public String getTenNXB() {
		return tenNXB;
	}
	public void setTenNXB(String tenNXB) {
		this.tenNXB = tenNXB;
	}
	public int getSoBan() {
		return soBan;
	}
	public void setSoBan(int soBan) {
		this.soBan = soBan;
	}
	
	public void print() {
		System.out.println("Ma tai lieu: " + getMaTaiLieu() + "\n"
							+ "Ten NXB: " + getTenNXB() + "\n"
							+ "So ban phat hanh: " + getSoBan());
		System.out.println("*********************");
	}
	
	public void inputInfo() {
		System.out.println("Moi ban nhap ma tai lieu: ");
		maTaiLieu = scanner.nextLine();
		System.out.println("Moi ban nhap ten NXB: ");
		tenNXB = scanner.nextLine();
		System.out.println("Moi ban nhap so ban phat hanh: ");
		soBan = scanner.nextInt();
		scanner.nextLine();
		scanner.close();
	}
	
}
