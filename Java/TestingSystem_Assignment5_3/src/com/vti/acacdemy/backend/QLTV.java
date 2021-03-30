package com.vti.acacdemy.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.acacdemy.entity.Bao;
import com.vti.acacdemy.entity.Sach;
import com.vti.acacdemy.entity.TaiLieu;
import com.vti.acacdemy.entity.TapChi;

public class QLTV {
	
	private Scanner scanner;
	private List<TaiLieu> taiLieus;
	
	public QLTV() {
		scanner = new Scanner(System.in);
		taiLieus = new ArrayList<>();
	}
	
	public void themMoiTaiLieu() {
		System.out.print("Ban muon them loai tai lieu nao\n"
				            + "1. Sach\n"
							+ "2. Tap chi\n"
				            + "3. Bao");
		int choose = scanner.nextInt();
		scanner.nextLine();
		switch (choose) {
		case 1:
			Sach sach = new Sach();
			taiLieus.add(sach);
			System.out.println("Them tai lieu thanh cong");
			break;
		case 2:
			TapChi tapChi = new TapChi();
			taiLieus.add(tapChi);
			System.out.println("Them tai lieu thanh cong");
			break;
		case 3:
			Bao bao = new Bao();
			taiLieus.add(bao);
			System.out.println("Them tai lieu thanh cong");
			break;
		default:
			break;
		}
	}
	
	public void xoaTaiLieuTheoMa() {
		System.out.print("Moi ban nhap ma tai lieu can xoa: ");
		String maDelete = scanner.nextLine();
		for(TaiLieu taiLieu: taiLieus) {
			if(taiLieu.equals(maDelete)) {
				taiLieus.remove(taiLieu);
				System.out.println("Xoa tai lieu thanh cong!!!");
				break;
			}
		}
		System.out.println("Xoa tai lieu khong thanh cong");
	}
	
	public void hienThiThongTinTaiLieu() {
		for(TaiLieu taiLieu: taiLieus) {
			taiLieu.print();		
		}
	}
	
	public void timKiemTaiLieuTheoLoai() {
		System.out.println("Ban muon tim kiem theo loai nao: "
				            + "1. Sach\n"
					        + "2. Tap chi\n"
		                    + "3. Bao");
		int choose = scanner.nextInt();	
		scanner.nextLine();
		switch (choose) {
		case 1:
			
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			break;
		}
	}
}
