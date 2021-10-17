package com.revature.bankapp.dao.impl;

import static org.junit.Assert.fail;
import java.sql.SQLException;
import org.junit.Test;
import com.revature.bankapp.model.Customer;

public class CustomerDaoImplTest {
	
	Customer customer = new Customer("supriya","singh","supriya@gmail.com","111");
	CustomerDaoImpl dao = new CustomerDaoImpl();

	@Test
	void testCreate() {
		
		
		try {
			dao.create(customer);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail ("Not yet implemented");
			
		}
	}
	
	

}