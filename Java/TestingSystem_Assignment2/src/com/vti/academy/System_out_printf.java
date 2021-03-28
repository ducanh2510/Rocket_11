package com.vti.academy;
import java.text.SimpleDateFormat;
import java.util.Date;

public class System_out_printf {

	// Question 1
	public static void question1() {
		int number = 5;
		System.out.printf("So nguyen la %d\n", number);
	}
	
	// Question 2
	public static void question2() {
		int number = 100000000;
		System.out.printf("So nguyen la %,d\n", number);
	}
	
	// Question 3
	public static void question3() {
		float number = 5.567098f;
		System.out.printf("So thuc la %.4f\n", number);
	}
	
	// Question 4
	public static void question4() {
		String fullname = "Luu Duc Anh";
		System.out.printf("Toi ten la \"%s\" va toi dang doc than\n", fullname);
	}
	
	// Question 5
	public static void question5() {
		String pattern = "dd/MM/yyyy HH:mm:ss";
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		System.out.println("Ngay hien tai la: " + dateFormat.format(date));
	}
	
	public static void main(String[] args) {
		// question1();
		// question2();
		// question3();
		// question4();
		// question5();
	}
	
	
}








