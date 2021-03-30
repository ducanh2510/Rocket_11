package com.vti.academy.frontend;

import com.vti.academy.backend.ITuyenSinh;
import com.vti.academy.backend.TuyenSinh;

public class Program {
	public static void main(String[] args) {
		ITuyenSinh tuyenSinh = new TuyenSinh(); 
		tuyenSinh.themThiSinh();
		tuyenSinh.themThiSinh();
		tuyenSinh.hienThiThongTinVaKhoiThi();
		tuyenSinh.timKiemTheoSBD();
	}
}
