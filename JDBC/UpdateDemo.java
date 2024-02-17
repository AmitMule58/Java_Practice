package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

// Program for Updating the DB
public class UpdateDemo {

	public static void main(String[] args) {
		try {
			// 1. Load Driver class
			Class.forName("com.mysql.jdbc.Driver");

			// 2. Establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

			// 3.Prepared Statement
			PreparedStatement ps = con.prepareStatement("update user set firstName=?, lastName=? where id=?");
			ps.setString(1, "rohit");
			ps.setString(2, "pawar");
			ps.setString(3, "4");

			int x = ps.executeUpdate();
			System.out.println("Updated record>> " + x);

			// 4. Close the resources
			con.close();
			ps.close();

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}
}
