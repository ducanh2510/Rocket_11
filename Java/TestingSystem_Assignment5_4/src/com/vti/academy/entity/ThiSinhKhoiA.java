package com.vti.academy.entity;


public class ThiSinhKhoiA extends ThiSinh {
	private int a;
	public ThiSinhKhoiA() {
		super();
		khoi = 'A';
		String[] cacMon = {"Toan", "Ly", "Hoa"};
		super.cacMon = cacMon;
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Cac mon: " + cacMon[0]);
	}

}
