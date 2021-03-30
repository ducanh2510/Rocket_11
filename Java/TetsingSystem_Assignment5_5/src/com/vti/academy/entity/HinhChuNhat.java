package com.vti.academy.entity;

public abstract class HinhChuNhat {
	
	public int tinhChuVi(int chieuDai, int chieuRong) {
		System.out.println("Tinh chu vi hinh chu nhat");
		return (chieuDai + chieuRong) * 2;
	}
	
	public int tinhDienTich(int chieuDai, int chieuRong) {
		System.out.println("Tinh dien tich hinh chu nhat");
		return chieuDai * chieuRong;
	}
	
}
