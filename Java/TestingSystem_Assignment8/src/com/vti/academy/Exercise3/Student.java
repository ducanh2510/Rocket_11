package com.vti.academy.Exercise3;

public class Student<T, T1> {
	private T id;
	private String name;
	
	public Student(T id) {
		this.id = id;
	}
	
	public void getPara(T1 parameter) {
		System.out.println(parameter);
	}
	
	public static void main(String[] args) {
		Student<Integer, Object> s1 = new Student<>(1);
		Student<Float, Object> s2 = new Student<>(2.0f);
		Student<Double, Object> s3 = new Student<>(3.0);
		s1.getPara("Nguyen Van Nam");
	}

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
