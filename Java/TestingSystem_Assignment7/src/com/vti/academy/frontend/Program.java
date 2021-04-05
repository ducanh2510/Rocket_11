package com.vti.academy.frontend;

import java.net.Socket;

import com.vti.academy.backend.Exercise1.PrimaryStudent;
import com.vti.academy.backend.Exercise1.SecondaryStudnet;
import com.vti.academy.backend.Exercise1.Student;

public class Program {
	public static void main(String[] args) throws Exception{
		
		// B1: Cac student nop quy
		PrimaryStudent student1 = new PrimaryStudent("Nguyen Van A");
		PrimaryStudent student2 = new PrimaryStudent("Nguyen Van B");
		SecondaryStudnet student3 = new SecondaryStudnet("Nguyen Van D");
		SecondaryStudnet student4 = new SecondaryStudnet("Nguyen Van E");
		SecondaryStudnet student5 = new SecondaryStudnet("Nguyen Van F");
		SecondaryStudnet student6 = new SecondaryStudnet("Nguyen Van G");
		PrimaryStudent student7 = new PrimaryStudent("Nguyen Van B");
		SecondaryStudnet student8 = new SecondaryStudnet("Nguyen Van D");
		
		System.out.println("Tong so hoc sinh la: " + Student.count);
		System.out.println("So hoc sinh PriamryStudent la: " + PrimaryStudent.countPri);
		System.out.println("So hoc sinh SecondaryStudnet la: " + SecondaryStudnet.countSec);
		
		Student[] students = {student1, student2, student3};
		
		// B2: Student1 lay tien di mua lien hoan
		System.out.println("Student1 lay tien di mua lien hoan");
		student1.layTien(50);
		System.out.println("So tien quy con lai la: " + Student.moneyGroup);
		
		// B3: Student2 lay tien di mua banh mi
		System.out.println("Student2 lay tien di mua banh mi");
		student2.layTien(20);
		System.out.println("So tien quy con lai la: " + Student.moneyGroup);
		
		// B4: Student3 di mua do dung hoc tap
		System.out.println("Student3 di mua do dung hoc tap");
		student3.layTien(150);
		System.out.println("So tien quy con lai la: " + Student.moneyGroup);

//		for(Student student: students) {
//			System.out.println(student.toString());
//		}
//		Student.college = "Dai hoc Cong Nghe";
//		
//		for(Student student: students) {
//			System.out.println(student.toString());
//		}
		
	}
}
