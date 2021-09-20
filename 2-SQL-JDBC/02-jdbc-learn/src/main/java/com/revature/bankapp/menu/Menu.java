package com.revature.bankapp.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Menu {                                                         
	protected String name;
	protected List<String> menuItems;//list is used to hold the menu itens list
	protected int selection; //since selection is an instance variable, so we write this-line number-35
	
	public Menu(String name) {
		this.name = name;
		menuItems = new ArrayList<>(); //reason to use list is if it has an order, we get in ordered
		// these two lines are common for ever menu
	}                        
	
	public void addMenuItem(String menuItemName) {
		menuItems.add(menuItemName);
	}
	
	
	//now we can add display menu
	public void displayMenu() {
		System.out.println("\n---------");
		System.out.println(name);
		System.out.println("------------");
		for (int i=0; i<menuItems.size(); i++) {// we cant use enhanced for loop,instead use index based for loop
			System.out.println((i+1)+ "] " + menuItems.get(i));
		}
		System.out.println("Choose the option: ");
		
	}
	
	public void captureSelection() { // here data is captured in this block
		Scanner scanner = new Scanner(System.in);  //called display menu here
	    selection = Integer.parseInt(scanner.nextLine());// scanner always use next line-remember this //selection -is an instance variable, see in line 11
		//handleAction();
							
	}
	public void displayMenuAndCaptureSelection() {
		displayMenu();
		captureSelection();
		handleAction(); // here switch case is used for different menu
	
}
	
	abstract void handleAction();
	
}
