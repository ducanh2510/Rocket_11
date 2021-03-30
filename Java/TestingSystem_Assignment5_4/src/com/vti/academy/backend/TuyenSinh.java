package com.vti.academy.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.academy.entity.ThiSinh;
import com.vti.academy.entity.ThiSinhKhoiA;
import com.vti.academy.entity.ThiSinhKhoiB;
import com.vti.academy.entity.ThiSinhKhoiC;


public class TuyenSinh implements ITuyenSinh {

	private Scanner scanner;
	private List<ThiSinh> thiSinhs;

	public TuyenSinh() {
		scanner = new Scanner(System.in);
		thiSinhs = new ArrayList<>();
	}

	@Override
	public void themThiSinh() {
		// TODO Auto-generated method stub
		System.out.println("Ban muon nhap thi sinh nao?\n" + "1. Khoi A\n" + "2. Khoi B\n" + "3. Khoi C");
		int choose = scanner.nextInt();
		ThiSinh thiSinh = null;
		switch (choose) {
		case 1:
			thiSinh = new ThiSinhKhoiA();
			break;
		case 2:
			thiSinh = new ThiSinhKhoiB();
			break;
		case 3:
			thiSinh = new ThiSinhKhoiC();
			break;
		default:
			break;
		}
		thiSinhs.add(thiSinh);
	}

	@Override
	public void hienThiThongTinVaKhoiThi() {
		for (ThiSinh thiSinh : thiSinhs) {
			thiSinh.showInfo();
		}
	}

	@Override
	public void timKiemTheoSBD() {
		System.out.println("Moi ban nhap so bao danh can tim kiem: ");
		int sbdSearch = scanner.nextInt();
		for(ThiSinh thiSinh: thiSinhs) {
			if(thiSinh.getSbd() == sbdSearch) {
				thiSinh.showInfo();
			}
		}
	}
}
