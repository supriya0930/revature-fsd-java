package com.revature.bankapp.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private static long counter = 0;
	private ArrayList<Account> accountList;
	

	private static Account currentAccount;

	public static Account getCurrentAccount() {
		return currentAccount;
	}

	public static void setCurrentAccount(Account currentAccount) {
		Customer.currentAccount = currentAccount;
	}

	static {
		
	}

	public Customer(String firstName, String lastName, String email, String password) {
		super();
		counter++;
		this.id = counter;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.accountList = accountList;

	}

	public long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setId(long id) {
		this.id = id;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void setAccountList(ArrayList<Account> accountList) {
		this.accountList = accountList;
	}

	public static long selectAccount() {
		System.out.print("Select account to perform transaction : ");
		Scanner scanner = new Scanner(System.in);
		long choice = scanner.nextInt();
//		    
		return choice;
	}

	
	}

