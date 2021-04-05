package com.vti.academy.entity;

public class HinhChuNhat extends HinhHoc{
	private float chieuDai, chieuRong;
	
	public HinhChuNhat() throws Exception{
		
	}
	
	public float chuVi() {
		return (chieuDai + chieuRong) * 2;
	}
	
	public float dienTich() {
		return chieuDai * chieuRong;
	}
}
