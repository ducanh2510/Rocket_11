package com.vti.academy.frontend;

import java.util.Scanner;

import com.vti.academy.backend.MyNews;

public class ProgramNews {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		MyNews myNews = new MyNews();
		myNews.menu();
		while(true) {
			System.out.print("Moi ban nhap lua chon: ");
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				myNews.insertNews();
				break;
			case 2:
				myNews.viewListNews();
				break;
			case 3:
				myNews.averageRate();
				break;
			case 4:
				System.out.println("Thoat chuong trinh");
				return;
			default:
				break;
			}
		}
	}
}
