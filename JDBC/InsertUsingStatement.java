package com.test;

import java.awt.print.Printable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertUsingStatement {
	public static void main(String[] args) {

		try { // insert Query
			String sql = "INSERT INTO user(firstName, lastName,Address, city, salary) values('Sahil', 'jagtap', 'Baner', 'Pune', '30000');";

			// 1. Load the driver Class
			Class.forName("com.mysql.jdbc.Driver");

			// 2. Establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

			// 3. Create the statement
			Statement statement = con.createStatement();
			statement.execute(sql);
			System.out.println("Insertion Complete!!");
			con.close();
			statement.close();

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
