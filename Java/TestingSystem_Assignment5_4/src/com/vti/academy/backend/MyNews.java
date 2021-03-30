package com.vti.academy.backend;

import java.nio.channels.NonWritableChannelException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.academy.entity.News;

public class MyNews {
	
	private Scanner scanner;
	private List<News> news;
	private int[] rates;
	
	public MyNews() {
		scanner = new Scanner(System.in);
		news = new ArrayList<>();
		rates = new int[3];
	}
	
	public void menu() {
		System.out.println("**********MENU**********\n"
				+ "1. Insert News\n"
				+ "2. View List News\n"
				+ "3. Average rate\n"
				+ "4. Exit"); 
	}
	
	public void insertNews() {
		News newInput = new News();
		int option;
		do {
			System.out.println("Hay nhap 3 de tiep tuc");
			option = scanner.nextInt();
			if(option == 3) {
				rates = newInput.rateInput();
				newInput.caculate(rates);
			}
		}while(option != 3);
		news.add(newInput);
		System.out.println("Insert thanh cong!!!");
	}
	
	public void viewListNews() {
		for(News newUnit: news) {
			newUnit.display();
		}
	}
	
	public float averageRate() {
		int sumRate = 0;
		for(int rate: rates) {
			sumRate += rate;
		}
		return (float) sumRate / rates.length;
	}
	
}
