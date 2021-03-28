package com.vti.acacdemy.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TapChi extends TaiLieu{
	private int soPhatHanh;
	private Date ngayPhatHanh;
	
	private Scanner scanner;
	
	public TapChi() {
		scanner = new Scanner(System.in);
		inputInfo();
	}
	
	public int getSoPhatHanh() {
		return soPhatHanh;
	}
	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}
	public Date getNgayPhatHanh() {
		return ngayPhatHanh;
	}
	public void setNgayPhatHanh(Date ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}
	
	public void inputInfo() {
		super.inputInfo();
		System.out.println("Moi ban nhap so phat hanh: ");
		soPhatHanh = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Moi ban nhap ngay phat hanh: ");
		String dateInput = scanner.nextLine();
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat formatter = new SimpleDateFormat(pattern);
		try {
			setNgayPhatHanh(formatter.parse(dateInput));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		scanner.close();
	}
	
	
}
