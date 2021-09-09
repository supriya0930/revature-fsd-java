package com.revature.bankapp.main;

import com.revature.bankapp.menu.MainMenu;

public class BankApp {

	public static void main(String[] args) {
		//create an instance of main menu
		MainMenu menu = new MainMenu("Main Menu");
		
	/*	menu.addMenuItem("Register new Customer");
		menu.addMenuItem("Login as Customer");
		menu.addMenuItem("Login as Employee");
		menu.addMenuItem("Exit"); */
		
		//menu.displayMenu();//call parents display menu
		 menu.displayMenuAndCaptureSelection();
		
	/*	CustomerMainMenu customerMenu = new CustomerMainMenu("Customer Main Menu");
		customerMenu.addMenuItem("View Account");
		customerMenu.addMenuItem("Create new Account");
		customerMenu.addMenuItem("Logout");
		customerMenu.displayMenu(); */
	}

}
