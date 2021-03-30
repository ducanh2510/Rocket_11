package com.vti.academy;

import java.util.Scanner;

public class Loop {
	static float[] arrFloat = {3f, 5f, 6f, 2f, 12f};
	static Scanner scanner = new Scanner(System.in);
	static float sum = 0f, avg = 0f, sumNegative = 0f, sumPositive = 0f, sumEven = 0f, sumOdd = 0f;
	public static void Question1() {
		boolean hasNegative = false, hasPositive = false;
		for(int i = 0; i < arrFloat.length; i++) {
			sum += arrFloat[i];
			if(arrFloat[i] < 0) {
				hasNegative = true;
				sumNegative += arrFloat[i];
			}else if(arrFloat[i] > 0) {
				hasPositive = true;
				sumPositive += arrFloat[i];
			}else if(i % 2 != 0) {
				sumOdd += arrFloat[i];
			}else if(i % 2 == 0) {
				sumEven += arrFloat[i];
			}
		}
		avg = sum / arrFloat.length;
		System.out.println("Tong cua day la: " + sum);
		System.out.println("Tong so o vi tri chan cua day la: " + sumEven);
		System.out.println("Tong so o vi tri le cua day la: " + sumOdd);
		if(hasNegative) {
			System.out.println("Tong so am day la: " + sumNegative);
		}else System.out.println("Khong co so am trong day!!");
		
		if(hasPositive) {
			System.out.println("Tong so duong day la: " + sumPositive);
		}else System.out.println("Khong co so duong trong day!!");
	}
	
	public static void question2() {
		System.out.println("Moi nhap phan tu can tim: ");
		float x = scanner.nextFloat();
		for(int i = 0; i < arrFloat.length; i++) {
			if(arrFloat[i] == x) System.out.println("Vi tri xuat hien dau tien la: " + i);
			break;
		}
	}
	
	public static void main(String[] args) {
		
	}
}
