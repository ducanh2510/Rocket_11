package com.vti.academy.entity;

public class HinhTron extends HinhHoc{
	private float banKinh;
	
	public HinhTron() throws Exception{
		
	}
	
	public float chuVi(){
		return banKinh * 2 * PI;
	}
	
	public float dienTich(){
		return banKinh * banKinh * PI;
	}
}
