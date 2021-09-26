package com.revature.bankapp.dao.impl;

import static org.junit.Assert.fail;
import java.sql.SQLException;

import org.junit.Test;



import com.revature.bankapp.model.Customer;

class CustomerDaoImplTest {

	@Test
	void test() {
		CustomerDaoImpl dao = new CustomerDaoImpl();
		Customer customer = new Customer("supriya","singh","supriya@gmail.com","111");
		try {
			dao.create(customer);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			fail ("Customer not created");
			e.printStackTrace();
		}
	}
	
	

}