package com.revature.bankapp.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.bankapp.model.Account;

public interface AccountDao {
	void int(Account account) throws SQLException;

	public List<Account> showAccounts() throws SQLException;
}