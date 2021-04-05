package com.vti.academy.backend.Exercise1;

public class SecondaryStudnet extends Student{
	public static int countSec = 0;
	public SecondaryStudnet(String name) throws Exception{
		super(name);
		countSec++;
	}
}
