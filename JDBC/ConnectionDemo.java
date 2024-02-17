package com.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDemo {
//Load the driver class
	public Connection getConnection() {
		Connection connection=null;
		try {
			// Load the driver class
			Class.forName("com.mysql.jdbc.Driver");

			// Establish the connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

}
