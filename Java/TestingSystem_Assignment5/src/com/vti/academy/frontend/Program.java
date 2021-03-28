package com.vti.academy.frontend;

import java.util.Scanner;

import com.vti.academy.backend.QLCB;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		QLCB qlcb = new QLCB();
		System.out.println("Moi ban nhap lua chon \n" 
							+ "1. Them can bo \n" 
							+ "2. Tim kiem can bo theo ten \n"
							+ "3. Hien thi thong tin can bo \n" 
							+ "4. Xoa can bo \n" 
							+ "5. Thoat chuong trinh");
		while (true) {
			System.out.print("Moi ban nhap lua chon: ");
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				qlcb.themCanBo();
				break;
			case 2:
				System.out.println("Moi ban nhap ten can tim: ");
				String nameSearch = scanner.nextLine();
				qlcb.timKiemTheoTen(nameSearch);
				break;
			case 3:
				qlcb.hienThiThongTinCanBo();
				break;
			case 4:
				qlcb.xoaCanBo();
				break;
			case 5:
				System.out.println("Thoat chuong trinh");
				scanner.close();
				return;
			default:
				break;
			}
		}
	}
}
