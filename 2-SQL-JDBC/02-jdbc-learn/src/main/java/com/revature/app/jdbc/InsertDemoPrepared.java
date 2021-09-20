package com.revature.app.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class InsertDemoPrepared {

	public static void main(String[] args) {

		try {
			// Driver driver = new Driver();
			// Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learndb", "root",
					"Turkey1800@");// password of sql workbench
			System.out.println("Connection successful. ");
			String sql = "insert into department (name) values (?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setString(1, "Research");
			statement.executeUpdate(); // insert to db

			statement.setString(1, "Statistics");
			statement.executeUpdate();

			// statement.executeQuery("") // use to get data
			connection.close();

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

}
