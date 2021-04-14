package com.vti.academy.backend;

import java.sql.Connection;
import java.sql.DriverManager;

public class Exercise5 {
	private Connection connection;
	
	// Question 1
	public void idConnectedForTesting() throws Exception{
		String url = "jdbc:mysql://localhost:3306/testingsystem?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");

		connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connect success!");
	}
	
	// Question 2
	public void connect() {
		
	}
	
	// Question 3
	public void disconnect() {
		
	}
	
	
	
	
	
	
	
	
}
