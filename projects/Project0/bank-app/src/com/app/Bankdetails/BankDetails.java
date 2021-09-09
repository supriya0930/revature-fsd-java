package com.app.Bankdetails;

import java.util.Scanner;

public class BankDetails {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("BankDetails");
			System.out.println("------------------");
			System.out.println("1. Customer Login");
			System.out.println("2. Employee Login");
			System.out.println("3. Exit");
			System.out.println("-------------------");

			System.out.println("Choose an option:");
			int choose = scanner.nextInt();

			if (choose == 1) {
				System.out.println("Login");
				System.out.println("Enter Username");
				String username = scanner.next();
				System.out.println("Enter your password");
				String password = scanner.next();

				if (username.matches("^[a-zA-Z0-9]{3,20}$") && password.matches("[0-9]{4,9}")) {

					System.out.println("Login Successful");

					System.out.println("Customer Menu");
					System.out.println("-------------");
					System.out.println("-------------");
					System.out.println("1. Create new bank account");
					System.out.println("2. Logout");

					choose = scanner.nextInt();
					System.out.println("Choose an option :" + choose);

					System.out.println();

				}
			}
			if (choose == 2) {
				System.out.println("Login");
				System.out.println("Enter Username");
				String username01 = scanner.next();
				System.out.println("Enter your password");
				String password01 = scanner.next();

				if (username01.matches("^[a-zA-Z0-9]{3,20}$") && password01.matches("[0-9]{4,9}")) {

					System.out.println("Login Successful");

					System.out.println("Customer Menu");
					System.out.println("-------------");
					System.out.println("-------------");
					System.out.println("1. Create new bank account");
					System.out.println("2. Logout");

					int choose01 = scanner.nextInt();
					System.out.println("Choose an option :" + choose01);

				}
			}
			if (choose == 3) {
				System.out.println("Exit");
				break;

			}
		}
	}

}
