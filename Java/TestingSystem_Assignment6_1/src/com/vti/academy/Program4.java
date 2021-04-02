package com.vti.academy;

public class Program4 {
	
	private static int[] department = {1, 2, 5};
	public static void getIndex(int index) throws Exception{
		if(index < department.length) {
			System.out.printf("Phan tu thu %d la: %d", index, department[index]);
		}else {
			throw new Exception("Cannot find department");
		}
	}

	public static void main(String[] args) throws Exception{
		getIndex(2);
	}

}
