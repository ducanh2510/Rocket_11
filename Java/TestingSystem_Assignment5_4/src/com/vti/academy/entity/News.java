package com.vti.academy.entity;

import java.util.Scanner;

import com.vti.academy.backend.INews;

public class News implements INews{

	private int id;
	private String title;
	private String publishDate;
	private String author;
	private String content;
	private float averageRate;
	private Scanner scanner;
	
	public News() {
		scanner = new Scanner(System.in);
		inputNew();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public float getAverageRate() {
		return averageRate;
	}
	
	public void inputNew() {
		System.out.print("Moi ban nhap ID: ");
		id = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Moi ban nhap Title: ");
		title = scanner.nextLine();
		System.out.print("Moi ban nhap PublishDate: ");
		publishDate = scanner.nextLine();
		System.out.print("Moi ban nhap Author: ");
		author = scanner.nextLine();
	}

	public void display() {
		System.out.println("Title: " + getTitle() + "\n"
							+ "PublishDate: " + getPublishDate() + "\n"
							+ "Author: " + getAuthor() + "\n"
							+ "Content: " + getContent() + "\n"
							+ "AverageRate: " + getAverageRate());
	}
	
	public int[] rateInput() {
		int[] rateInput = new int[3];
		for(int i = 0; i < 3; i++) { 
			System.out.print("Moi nhap phan tu thu " + (i + 1) + ": ");
			rateInput[i] = scanner.nextInt(); 
		}
		return rateInput;
	}
	
	public float caculate(int[] rates) {
		int sumRate = 0;
		for(int rate: rates) {
			sumRate += rate;
		}
		averageRate = (float) sumRate / rates.length;
		return (float) sumRate / rates.length;
	}
}
