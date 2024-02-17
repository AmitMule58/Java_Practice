package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//select/retrieve
public class SelectDemo {
	public static void main(String[] args) {
		try {
			// 1. Load the driver class
			Class.forName("com.mysql.jdbc.Driver");

			// 2. Establish the Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

			// 3. create Prepare statement // Select Query
			PreparedStatement ps = con.prepareStatement("select * from user");
//				 we are not  used ? in ps so no need to use setString() method

			ResultSet set = ps.executeQuery();// we will be getting result after executing the query
			while (set.next()) { // we will be checking if result set has record or not
				System.out.println("ID>> " + set.getInt(1)); // retrieve the data from that column (1)
				System.out.println("FirstName>> " + set.getString(2));
				System.out.println("LastName>> " + set.getString(3));
				System.out.println("Address>> " + set.getString(4));
				System.out.println("City>> " + set.getString(5));
				System.out.println("Salary>> " + set.getString(6));
				System.out.println();

			}

			// 4. Close the resources
			con.close();
			ps.close();
			set.close();
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}

}
