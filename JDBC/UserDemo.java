package com.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserDemo {
	Connection connection = null;
	PreparedStatement ps = null;

	private void insertUserDetails(String FirstName, String LastName, String Address, String City, String Salary)
			throws SQLException {
		try {
			ConnectionDemo connectionDemo = new ConnectionDemo();
			Connection connection = connectionDemo.getConnection();
			PreparedStatement ps = connection
					.prepareStatement("insert into user (FirstName,LastName,Address, City, Salary)values(?,?,?,?,?)");
			ps.setString(1, FirstName);
			ps.setString(2, LastName);
			ps.setString(3, Address);
			ps.setString(4, City);
			ps.setString(5, Salary);

			int x = ps.executeUpdate();
			System.out.println("record Inserted>> " + x);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
			ps.close();
		}
	}

	// FirstName, LastName, Address, City, Salary
	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 1; i <= 2; i++) {
			System.out.println("Enter First Name>> ");
			String Firstname = scanner.nextLine();

			System.out.println("Enter last Name>> ");
			String LastName = scanner.nextLine();

			System.out.println("Enter Address>> ");
			String Adress = scanner.nextLine();

			System.out.println("Enter City>> ");
			String City = scanner.nextLine();

			System.out.println("Enter Salary>> ");
			String Salary = scanner.next();

			UserDemo userdemo = new UserDemo();
			userdemo.insertUserDetails(Firstname, LastName, Adress, City, Salary);
		}
	}
}
