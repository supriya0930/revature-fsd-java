package com.revature.app.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.omg.PortableInterceptor.SUCCESSFUL;

import java.sql.Connection;

public class JDBCDemo {

	public static void main(String[] args) {

		try {
			// Driver driver = new Driver();
			// Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver"); // connection url , wha
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learndb", "root",
					"Turkey1800@");// password of sql workbench
			System.out.println("Connection successful. ");
			String sql = "insert into department (name) values ('Innovation')";
			Statement statement = connection.createStatement();
			statement.executeUpdate(sql); // insert to db
			// statement.executeQuery("") // use to get data
			connection.close();

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
