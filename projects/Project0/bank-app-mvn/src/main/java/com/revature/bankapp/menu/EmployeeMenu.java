package com.revature.bankapp.menu;

import java.sql.SQLException;
import java.util.List;

import com.revature.bankapp.dao.EmployeeDao;
import com.revature.bankapp.dao.impl.EmployeeDaoImpl;
import com.revature.bankapp.model.Account;
import com.revature.bankapp.model.Customer;
import com.revature.bankapp.model.Transaction;

public class EmployeeMenu extends Menu {
	public EmployeeMenu(String name) {
		super(name);
		addMenuItem("View Customers");
		addMenuItem("View Accounts");
		addMenuItem("View Transactions");
		addMenuItem("Logout");

	}

	@Override
	void handleAction() {
		EmployeeDaoImpl employeedaoimpl = new EmployeeDaoImpl();
		switch (selection) {

		case 1:
			try {
				List<Customer> list = employeedaoimpl.viewCustomer();
				for (int i = 0; i < list.size(); i++) {
					System.out.println((i + 1) + ") " + list.get(i));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			displayMenuAndCaptureSelection();
			break;
		case 2:
			try {
				List<Account> list = employeedaoimpl.viewAccount();
				for (int i = 0; i < list.size(); i++) {
					System.out.println((i + 1) + ") " + list.get(i));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			displayMenuAndCaptureSelection();
			break;
		case 3:
			try {
				List<Transaction> list = employeedaoimpl.viewTransaction();
				for (int i = 0; i < list.size(); i++) {
					System.out.println((i + 1) + ") " + list.get(i));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			displayMenuAndCaptureSelection();
			break;

		case 4:
			MainMenu mm = new MainMenu("Main Menu");
			mm.displayMenuAndCaptureSelection();
			break;
		}

	}

}