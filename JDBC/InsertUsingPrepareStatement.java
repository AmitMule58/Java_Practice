package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertUsingPrepareStatement {
	public static void main(String[] args) {
		try {
			// 1. Load the driver class
			Class.forName("com.mysql.jdbc.Driver");

			// 2. Establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

			// Prepared Statement
			PreparedStatement ps = con.prepareStatement(
					"INSERT INTO user(firstName, lastName,Address, city, salary) values(?, ?, ?, ?, ?)");
			ps.setString(1, "Shruti");
			ps.setString(2, "Mehra");
			ps.setString(3, "kpthrud");
			ps.setString(4, "pune");
			ps.setString(5, "25000");

			int x = ps.executeUpdate();
			System.out.println("Inserted Record>> " + x);

			// 4. Close the resources
			con.close();
			ps.close();

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
