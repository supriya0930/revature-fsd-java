package com.revature.app.jdbc;

public class InsertDemoPrepare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
		
		
		
		String sql = "insert into employee (name, salary, gender, department_id) values (?, ?, ?, ?)";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, "Jacob");
		statement.setDouble(2, 1500.0);
		statement.setString(3, "M");
		statement.setInt(4, 2);
		statement.executeUpdate();
		connection.close();
