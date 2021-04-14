package com.vti.academy.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exercise1 {
	private Connection connection;
	
	/* Question 1
	 * Tao ket noi toi database
	 */
	public void connectDatabase() throws Exception{
		String url = "jdbc:mysql://localhost:3306/testingsystem?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");

		connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connect success!");
	}
	
	/* Question 2
	 * In ra thong tin cua position 
	 */
	public void showInfoPositionFromDatabase() throws Exception{
		connectDatabase();
		Statement statement = connection.createStatement();
		String sqlQuery = "select *from Position;";
		ResultSet resultSet = statement.executeQuery(sqlQuery);
		System.out.println();
		while(resultSet.next()) {
			System.out.print(resultSet.getInt("PositionID"));
			System.out.println("\t" + resultSet.getString("PositionName"));
		}
	}
	
	/* Question 3
	 * Tao position 
	 */
	public void createPosition() throws Exception{
		connectDatabase();
//		Statement statement = connection.createStatement();
		String sqlQuery = "Insert into Position (PositionName)\n"
						+ "values (?)";
		PreparedStatement prepaStatement = connection.prepareStatement(sqlQuery);
		prepaStatement.setString(1, "Test");
		prepaStatement.executeUpdate();
	}
	
	/* Question 4
	 * Update position
	 */
	public void updatePosition() throws Exception{
		connectDatabase();
		String sqlQuery = "Update Position "
						+ "set PositionName = ? "
						+ "where PositionID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
		String newPositionName = "coder";
		int id = 1;
		preparedStatement.setString(1, newPositionName);
		preparedStatement.setInt(2, id);
		preparedStatement.executeUpdate();
	}
	
	/* Question 5
	 * Delete Position
	 */
	public void deletePosition() throws Exception{
		connectDatabase();
		String sqlQuery = "Delete from Position "
						+ "where PositionID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
		int id = 1;
		preparedStatement.setInt(1, id);
		preparedStatement.executeUpdate();
	}
	
}




