package com.vti.academy.entity;

public class PStudent extends Person{
	private int maSinhVien;
	private float diemTrungBinh;
	private String email;
	
	@Override
	public void inputInfo() {
		super.inputInfo();
		System.out.print("Moi nhap ma sinh vien: ");
		maSinhVien = scanner.nextInt();
		System.out.println("Moi nhap diem trung binh: ");
		diemTrungBinh = scanner.nextFloat();
		scanner.nextLine();
		System.out.println("Moi nhap email: ");
		email = scanner.nextLine();
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Ma sinh vien: " + maSinhVien
							+ "\nDiem trung binh: " + diemTrungBinh
							+ "\nEmail: " + email);
	}
	
	public void hasSchoolarship() {
		if(diemTrungBinh > 8.0) {
			System.out.println("Dat duoc hoc bong");
		}else {
			System.out.println("Khong dat duoc hoc bong");
		}
	}
	
	
}
