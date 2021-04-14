package com.vti.academy.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Exercise3 {
	private Connection connection;
	
	public void connectDatabase() throws Exception{
		String url = "jdbc:mysql://localhost:3306/testingsystem?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");

		connection = DriverManager.getConnection(url, username, password);
		
		System.out.println("Connect success!");
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
	
	/*	Question 1
	 * Yeu cau nhap vao id roi xoa department
	 */
	public void deleteDepartmentUsingProcedure(int id) throws Exception{
		connectDatabase();
		if(isDepartmentIDExists(id)) {
			String sqlQuery = "DELIMITER $$\r\n"
							+ "CREATE PROCEDURE sp_delete_department(IN id TINYINT)\r\n"
							+ "BEGIN\r\n"
							+ "DELETE FROM department\r\n"
							+ "WHERE departmentID = id;\r\n"
							+ "END$$\r\n"
							+ "DELIMITER ;\n"
							+ "CALL sp_delete_department(?);";
			System.out.println(sqlQuery);
			PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
		}else {
			String message = "Cannot find department which has id = " + id;
			throw new Exception(message);
		}
	}
	
}




