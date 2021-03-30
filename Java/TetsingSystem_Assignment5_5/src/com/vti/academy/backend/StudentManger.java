package com.vti.academy.backend;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.vti.academy.entity.Student;

public class StudentManger {
	
	private Random random;
	private Scanner scanner;
	private List<Student> students;
	public StudentManger() {
		random = new Random();
		scanner = new Scanner(System.in);
		students = new ArrayList<>();
	}
	
	public void createStudent() {
		for(int i = 0; i < 10; i++) {
			Student student = new Student();
			System.out.println("Moi nhap ID: ");
			student.setId(scanner.nextInt());
			scanner.nextLine();
			System.out.println("Moi nhap ten: ");
			student.setName(scanner.nextLine());
			student.setGroup(1 + random.nextInt(2));
			students.add(student);
		}
	}
	
	public void callAllStudent() {
		for(Student student: students) {
			student.diemDanh();
		}
	}
	
	public void callGroup1() {
		for(Student student: students) {
			if(student.getGroup() == 1) student.hocBai();
		}
	}
	
	public void callGroup2() {
		for(Student student: students) {
			if(student.getGroup() == 2) student.donVeSinh();
		}
	}
	
}
