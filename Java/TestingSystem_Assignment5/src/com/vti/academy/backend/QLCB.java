package com.vti.academy.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.academy.entity.CanBo;
import com.vti.academy.entity.CongNhan;
import com.vti.academy.entity.KySu;
import com.vti.academy.entity.NhanVien;

public class QLCB{
	private List<CanBo> canBos;
	private Scanner scanner;

	public QLCB() {
		canBos = new ArrayList<>();
		scanner = new Scanner(System.in);
	}

	public void themCanBo() {
		System.out.println("Ban muon nhap cho bo phan nao:"  
							+ "1. NhanVien" 
							+ "2. CongNhan" 
							+ "3. KySu");
		int choose = scanner.nextInt();
		switch (choose) {
		case 1:
			NhanVien nhanVien = new NhanVien();
			canBos.add(nhanVien);
			System.out.println("Them thanh cong!");
			break;
		case 2:
			CongNhan congNhan = new CongNhan();
			canBos.add(congNhan);
			System.out.println("Them thanh cong!");
			break;
		case 3:
			KySu kySu = new KySu();
			canBos.add(kySu);
			System.out.println("Them thanh cong!");
			break;
		default:
			break;
		}
	}

	public CanBo timKiemTheoTen(String nameSearch) {
		String nameSplit[] = nameSearch.split(" ");
		int count = 0, length = nameSplit.length;
		for(CanBo canbo: canBos) {
			for(int i = 0; i < length; i++) {
				if(canbo.getName().contains(nameSplit[i])) {
					count++;
				}
			}
			if(count == length) {
				System.out.println("Tim thay can bo!");
				canbo.toString();
				return canbo;
			}else {
				count = 0;
			}
		}
		System.out.println("Khong tim thay");
		return null;
	}

	public void hienThiThongTinCanBo() {
		for(CanBo canbo: canBos) {
			System.out.println(canbo.toString());;
		}
	}

	public void xoaCanBo() {
		if(canBos.size() == 0) {
			System.out.println("Khong the xoa. Khong con can bo trong danh sach");
			return;
		}
		System.out.println("Moi nhap ten can bo can xoa: ");
		String nameDelete = scanner.nextLine();
		CanBo canbo = timKiemTheoTen(nameDelete);
		canBos.remove(canbo);
	}

}
