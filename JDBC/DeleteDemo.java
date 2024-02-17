package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

// program for Deleting record from DB
public class DeleteDemo {
	public static void main(String[] args) {
		try {
			// 1. Load Driver Class
			Class.forName("com.mysql.jdbc.Driver");

			// 2. Establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

			// 3.Prepare statement
			PreparedStatement ps = con.prepareStatement("delete from user where id=?");
			ps.setString(1, "3"); // it will delete third record

			int x = ps.executeUpdate();
			System.out.println("Deleted Record>> " + x);

			// 4. Close the resources
			con.close();
			ps.close();

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();

		}
	}
}
