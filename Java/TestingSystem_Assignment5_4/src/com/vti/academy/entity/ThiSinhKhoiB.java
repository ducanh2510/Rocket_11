package com.vti.academy.entity;

public class ThiSinhKhoiB extends ThiSinh {

	public ThiSinhKhoiB() {
		super();
		khoi = 'B';
		String[] cacMon = {"Toan", "Hoa", "Sinh"};
		super.cacMon = cacMon;
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Cac mon: " + cacMon[0]);

	}
}
