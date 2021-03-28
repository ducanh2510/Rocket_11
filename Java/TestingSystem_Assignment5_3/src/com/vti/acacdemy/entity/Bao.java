package com.vti.acacdemy.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Bao extends TaiLieu{
	private Date ngayPhatHanh;
	
	private Scanner scanner;

	public Date getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanh(Date ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}
	
	public void inputInfo(){
		super.inputInfo();
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
