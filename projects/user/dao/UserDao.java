package com.revature.app.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import com.revature.bankapp.user.User;

public interface UserDao {
	
	
	ArrayList<User> getAllUser() throws SQLException;
	User getUserByid(int customerId) throws SQLException;
	
	void insertCustomerUser() throws SQLException;
	void upadateCustomerUser() throws SQLException;
	void deleteCustomerUser() throws SQLException;



}
