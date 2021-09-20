package com.revature.bankapp.dao.impl;

import java.sql.SQLException;

import org.junit.Test;

import com.revature.bankapp.model.Customer;

class CustomerDaoImplTest {

	@Test
	void test() throws SQLException {
		CustomerDaoImpl dao = new CustomerDaoImpl();
		Customer customer = new Customer("a","b","c","12");
		dao.create(customer);
	}

	private void fail(String string) {
		// TODO Auto-generated method stub
		
	}

	private void create(Customer customer) {
		// TODO Auto-generated method stub
		
	}

}
		
		