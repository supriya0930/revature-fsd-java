//2. Calculate Fahrenheit from Celsius - Page 14

package assignment;

import java.util.Scanner;

public class FahrenheitCalculation {

	public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Celsius Value: ");
		int celsiusValue= scanner.nextInt();
		
		int fahrenheit = (int) ((CelsiusValue * 9/5 ) + 32);
	    System.out.println("Fahrenheit = " + fahrenheit);			
   
	}

}
