package com.vti.academy.DemoJDBCV2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/testingsystem?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(url, username, password);

		System.out.println("Connection Success!");

		// Step 3: Create a statement object
		String sql = "Select * from Department";

		// Step 4: Excute Query
//		String sqlString = "select DepartmentID, DepartmentName "
//						  + "From Department";
		Statement statement = connection.createStatement();
		
		String sqlString = "insert into Department\n"
						+ "values (?, ?)";
		
		String sqlDelete = "delete from Department\n"
							+ "where departmentID = ?";
		
		//PreparedStatement preparedStatement = connection.prepareStatement(sqlString);
		PreparedStatement preparedStatement = connection.prepareStatement(sqlDelete);
		int id = 100;
		preparedStatement.setInt(1, id);
//		String name = "aaa";
//		
//		preparedStatement.setInt(1, id);
//		preparedStatement.setString(2, name);
		
		preparedStatement.executeUpdate();

		// ResultSet resultset = statement.executeQuery(sql);
		//ResultSet resultset = statement.executeQuery("");

		// Step 5: Xu li ket qua
//		while (resultset.next()) {
//			System.out.print(resultset.getInt("DepartmentID") + " ");
//			System.out.println(resultset.getString("DepartmentName"));
//		}
		
//		while (resultset.next()) {
//			System.out.print(resultset.getInt("DepartmentID"));
//			System.out.println("\t" + resultset.getString("DepartmentName"));
//		}
	}
}
