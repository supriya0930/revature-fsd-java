package com.revature.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.app.dao.UserDao;
import com.revature.app.dao.Util;
import com.revature.bankapp.user.User;
public class UserDaoImpl implements UserDao{

	@Override
	public ArrayList<User> getAllUser() throws SQLException {
		List<User> employeeArrayList = new ArrayList<>();
		try(Connection connection = Util.getConnection()){
			String sql = "select * from customer";
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			
			while (resultSet.next()) {		
				User user = new User();
				user.setId(resultSet.getInt("id"));
				user.setFirstName(resultSet.getString("firstName"));
				user.setLastName(resultSet.getString("lastName"));
				user.setEmail(resultSet.getString("email"));
				user.setPassword(resultSet.getString("password"));
				employeeArrayList.add(user);
			}
				
			}
			
			
		return employeeArrayList;
	}

	@Override
	public User getUserByid(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertCustomerUser() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void upadateCustomerUser() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomerUser() throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
