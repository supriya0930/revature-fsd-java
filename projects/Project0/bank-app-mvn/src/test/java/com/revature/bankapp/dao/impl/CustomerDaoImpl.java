package com.revature.bankapp.dao.impl;

import static org.junit.Assert.fail;

import java.sql.SQLException;

import com.revature.bankapp.model.Account;

public class CustomerDaoImpl {void test() {
		AccountDaoImpl adao = new AccountDaoImpl();
		Account account = new Account();
		account.setBalance(6000);
		account.setName("Seema");
		try {
			adao.create(account);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void test_Success() {
		AccountDaoImpl adao = new AccountDaoImpl();
		try {
			adao.showAccounts();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("failed getting account Details");
		}
	}
}