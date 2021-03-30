package com.vti.academy.entity;

public class Student implements IStudent{
	
	private int id;
	private String name;
	
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	private int group;	
	
	@Override
	public void diemDanh() {
		System.out.println(name + " diem danh");
	}
	
	@Override
	public void hocBai() {
		System.out.println(name + " hoc bai");
	}
	
	@Override
	public void donVeSinh() {
		System.out.println(name + " don ve sinh");
	}
	
}
