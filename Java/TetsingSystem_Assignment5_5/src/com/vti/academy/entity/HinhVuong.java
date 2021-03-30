package com.vti.academy.entity;

public class HinhVuong extends HinhChuNhat{
	private int canh;

	public int tinhChuVi() {
		System.out.println("Tinh chu vi hinh vuong");
		return super.tinhChuVi(canh, canh);
	}
	
	public int tinhDienTich() {
		System.out.println("Tinh dien tich hinh vuong");
		return super.tinhDienTich(canh, canh);
	}
	
}
