package com.vti.academy.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise2 {
	private Connection connection;
	public class Department{
		private int departmentID;
		private String departmentName;
		public void setDepartmentID(int departmentID) {
			this.departmentID = departmentID;
		}
		public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
		}
	}
	private Scanner scanner = new Scanner(System.in);
	private List<Department> departments = new ArrayList<Department>();
	public void connectDatabase() throws Exception{
		String url = "jdbc:mysql://localhost:3306/testingsystem?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");

		connection = DriverManager.getConnection(url, username, password);
		
		System.out.println("Connect success!");
	}
	
	public List<Department> getDepartments() throws Exception{
		connectDatabase();
		Statement statement = connection.createStatement();
		String sqlQuery = "select *from Department";
		ResultSet resultSet = statement.executeQuery(sqlQuery);
		while(resultSet.next()) { 
			Department department = new Department();
			department.setDepartmentID(resultSet.getInt("DepartmentID"));
			department.setDepartmentName(resultSet.getString("DepartmentName"));
			departments.add(department);
		}
		return departments;
	}
	
	public Department getDepartmentFromID() throws Exception{
		Department department = new Department();
		connectDatabase();
		String sqlQuery = "select * from Department "
						+ "where DepartmentID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
		int id = 200;
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			department.setDepartmentID(resultSet.getInt("DepartmentID"));
			department.setDepartmentName(resultSet.getString("DepartmentName"));
			System.out.print(department.departmentID);
			System.out.println("\t" + department.departmentName);
			return department;
		}
		System.out.println("Cannot find department which has id = 5");
		return null;
	}
	
	public Department getDepartmentFromID(int id) throws Exception{
		Department department = new Department();
		connectDatabase();
		String sqlQuery = "select * from Department "
						+ "where DepartmentID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			department.setDepartmentID(resultSet.getInt("DepartmentID"));
			department.setDepartmentName(resultSet.getString("DepartmentName"));
			System.out.print(department.departmentID);
			System.out.println("\t" + department.departmentName);
			return department;
		}
		System.out.println("Cannot find department which has id = " + id);
		return null;
	}
	
	public void showDepartment() throws Exception{		
		departments = getDepartments();
		for(Department department: departments) {
			System.out.print(department.departmentID);
			System.out.println("\t" + department.departmentName);
		}
	}
	
	public boolean isDepartmetnNameExists(String name) throws Exception{
		connectDatabase();
		String sqlQuery = "select * from Department "
						+ "where DepartmentName = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
		preparedStatement.setString(1, name);
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next()) return true;
		return false;
	}
	
	public void createDepartment() throws Exception{
		System.out.print("Moi nhap ten Department: ");
		String name = scanner.nextLine();
		boolean nameIsExists = isDepartmetnNameExists(name);
		if(nameIsExists) {
			throw new Exception("Department Name is Exists!");
		}else {
			String sqlQuery = "insert into Department(DepartmentName)"
							+ "values (?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
			preparedStatement.setString(1, name);
			preparedStatement.executeUpdate();
		}
	}
	
	public boolean isDepartmentIDExists(int id) throws Exception{
		connectDatabase();
		String sqlQuery = "select * from department "
						+ "where DepartmentID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next()) return true;
		return false;
	}
	
	public void updateDepartmentName(int id, String newName) throws Exception{
		if(isDepartmentIDExists(id)) {
			if(isDepartmetnNameExists(newName)) {
				throw new Exception("Department Name is Exists!");
			}else {
				String sqlQuery = "update Department "
						      	+ "set DepartmentName = ? "
						      	+ "where DepartmentID = ?";
				PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
				preparedStatement.setString(1, newName);
				preparedStatement.setInt(2, id);
				preparedStatement.executeUpdate();
			}
		}else {
			String message = "Cannot find department which has id = " + id;
			throw new Exception(message);
		}
	}
	
	public void deleteDepartment(int id) throws Exception{
		if(isDepartmentIDExists(id)) {
			String sqlQuery = "delete from Department "
							+ "where DepartmentID = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
		}else {
			String message = "Cannot find department which has id = " + id;
			throw new Exception(message);
		}
	}
	
}
