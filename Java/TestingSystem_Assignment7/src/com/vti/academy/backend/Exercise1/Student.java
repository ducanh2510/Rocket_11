package com.vti.academy.backend.Exercise1;

public class Student {
	private int id;
	private String name;
	public static String college = "Dai hoc Bach Khoa";
	public static int count = 0;
	public static int moneyGroup = 0;
	public static final int money = 100;
	
	public Student() {
		count++;
		moneyGroup += money;
		this.id = count;
	}
	
	public Student(String name) throws Exception{
		if(count >= 7) {
			throw new Exception("Chi duoc tao toi da 7 hoc sinh");
		}
		count++;
		moneyGroup += money;
		this.id = count;
		this.name = name;
	}
	
	public static void setCollege(String college) {
		Student.college = college;
	}
	
	public static void setCountWhenDelete() {
		Student.count--;
	}
	
	public static void layTien(int moneyDelete) {
		moneyGroup -= moneyDelete;
	}
	
	public static void dongThemQuy(int moneyAdd) {
		moneyGroup += moneyAdd;
	}
	
	@Override
	public String toString() {
		String result = "ID: " + getId()
					   + "\nName: " + getName()
					   + "\nColege: " + getCollege();
		return result;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public static String getCollege() {
		return college;
	}
	
}
