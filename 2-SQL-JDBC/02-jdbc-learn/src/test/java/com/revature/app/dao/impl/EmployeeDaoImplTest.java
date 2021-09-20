package com.revature.app.dao.impl;

import static org.junit.jupiter.api.Assertions.*;
import java.sql.SQLException;
import org.junit.jupiter.api.Test;
import com.revature.app.dao.EmployeeDao;

class EmployeeDaoImplTest {

	@Test
	void testList_Success() {
		EmployeeDao dao = new EmployeeDaoImpl();
		try {
			//dao.list(); //below line is written for assuring that element is present in table;Since test case paas in 
			//dao.list(). but its not true. It;s gives us fall assumption.
			assertTrue(dao.list().size() > 0);
} catch (SQLException e) {
			fail("Getting employee list failed.");
			
		}
	}

}
