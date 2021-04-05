package com.vti.academy.entity;

public class HinhHoc {
	public static int soLuongHinh = 0;
	public static final float PI = 3.14f;
	
	public HinhHoc() throws Exception{
		if(soLuongHinh >= Configs.SO_LUONG_HINH_TOI_DA) {
			throw new Exception("So luong hinh toi da la: " + Configs.SO_LUONG_HINH_TOI_DA);
		}
		soLuongHinh++;
	}
	
}
