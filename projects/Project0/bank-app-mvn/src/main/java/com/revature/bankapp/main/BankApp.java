package com.revature.bankapp.main;

import com.revature.bankapp.menu.MainMenu;
import com.revature.bankapp.menu.CustomerMenu;

public class BankApp {

	public static void main(String[] args) {
		// create an instance of main menu

		MainMenu menu = new MainMenu("Main Menu");
		menu.displayMenuAndCaptureSelection();

	}

}