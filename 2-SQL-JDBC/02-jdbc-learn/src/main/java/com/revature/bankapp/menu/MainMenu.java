package com.revature.bankapp.menu; //main menu is child class of menu

import java.util.Scanner;
import com.revature.bankapp.form.LoginForm;
import com.revature.bankapp.model.Customer;
import com.revature.bankapp.model.DataManager;

public class MainMenu extends Menu {

	public MainMenu(String name) { // theses two lines are constructor
		super(name);// generate superclass constructor here
		// TODO Auto-generated constructor stub

		addMenuItem("Register new Customer");
		addMenuItem("Login as Customer");
		addMenuItem("Login as Employee");
		addMenuItem("Exit");

	}

	@Override
	void handleAction() {
		// System.out.println("Selected option is :" + selection);

		Scanner scanner = new Scanner(System.in);
		switch (selection) {
		case 1:
			System.out.println("\n-------");
			System.out.println("Register new customer");
			System.out.println("----------\n");

			System.out.println("First Name: ");
			String firstName = scanner.nextLine();

			System.out.println("Last Name: ");
			String lastName = scanner.nextLine();

			System.out.println("Email: ");
			String email = scanner.nextLine();

			System.out.println("Password: ");
			String password = scanner.nextLine();

			DataManager.addCustomer(new Customer(firstName, lastName, email, password));
			System.out.println("Customer added successfully.");
			displayMenuAndCaptureSelection();
			break;

		case 2:
			/*
			 * System.out.println("\n--------"); System.out.println("Login");
			 * System.out.println("----------\n");
			 * 
			 * 
			 * System.out.println("Email: "); email = scanner.nextLine();
			 * 
			 * System.out.println("Password: "); password = scanner.nextLine();
			 * 
			 * Customer customer = DataManager.getCustomerByEmail(email); if (customer ==
			 * null) { System.out.println("Invalid email / password"); }else if
			 * (customer.getPassword().equals(password)) {
			 * System.out.println("Login Successful."); System.out.println("Welcome " +
			 * customer.getFirstName()); }else {
			 * System.out.println("Invalid email / password ");
			 */

			LoginForm loginForm = new LoginForm("Login Form");
			loginForm.captureDataAndPerformAction();
			break;

		}

	}

}
