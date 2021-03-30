package com.vti.acacdemy.entity;

import java.util.Scanner;

public class Sach extends TaiLieu{
	private String tacGia;
	private int soTrang;
	private Scanner scanner;
	
	public Sach() {
		scanner = new Scanner(System.in);
		inputInfo();
	}
	
	public String getTacGia() {
		return tacGia;
	}
	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}
	public int getSoTrang() {
		return soTrang;
	}
	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}
	
	public void inputInfo() {
		super.inputInfo();
		System.out.println("Moi ban nhap ten tac gia: ");
		setTacGia( scanner.nextLine());
//		tacGia = scanner.nextLine();
		System.out.println("Moi ban nhap so trang: ");
		soTrang = scanner.nextInt();
		scanner.nextLine();
		scanner.close();
	}
	
}
