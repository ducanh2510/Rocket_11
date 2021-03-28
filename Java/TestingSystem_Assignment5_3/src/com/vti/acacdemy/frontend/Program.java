package com.vti.acacdemy.frontend;

import java.util.Scanner;

import com.vti.acacdemy.backend.QLTV;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choose;
		QLTV qltv = new QLTV();
		System.out.println("Moi ban nhap lua chon: \n" 
							+ "1. Them moi tai lieu\n" 
							+ "2. Xoa tai lieu theo ma\n"
							+ "3. Hien thi thong tin tai lieu\n" 
							+ "4. Tim kiem tai lieu theo loai\n" 
							+ "5. Thoat chuong trinh");
		while (true) {
			System.out.println("Moi ban nhap lua chon: ");
			choose = scanner.nextInt();
			scanner.nextLine();
			switch (choose) {
			case 1:
				qltv.themMoiTaiLieu();
				break;
			case 2:
				qltv.xoaTaiLieuTheoMa();
				break;
			case 3:
				qltv.hienThiThongTinTaiLieu();
				break;
			case 4:
				qltv.timKiemTaiLieuTheoLoai();
				break;
			case 5:
				System.out.println("Thoat chuong trinh!!!");
				scanner.close();
				return;
			default:
				break;
			}
		}
	}
}
