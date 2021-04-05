package com.vti.academy.backend.Exercise1;

public class PrimaryStudent extends Student{
	public static int countPri = 0;
	public PrimaryStudent(String name) throws Exception{
		super(name);
		countPri++;
	}
}
