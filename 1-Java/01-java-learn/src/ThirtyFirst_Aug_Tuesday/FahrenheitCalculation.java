//2. Calculate Fahrenheit from Celsius - Page 14

package ThirtyFirst_Aug_Tuesday;

import java.util.Scanner;

public class FahrenheitCalculation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Celsius Value: ");
		float celsiusValue = scanner.nextFloat();

		float fahrenheit = ((celsiusValue * 9 / 5) + 32);
		System.out.println("Fahrenheit = " + fahrenheit);

	}

}
