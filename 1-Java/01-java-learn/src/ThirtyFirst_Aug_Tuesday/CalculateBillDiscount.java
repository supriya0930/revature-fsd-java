//1. Calculate Bill Discount Amount - Page 14

package ThirtyFirst_Aug_Tuesday;

import java.util.Scanner;

public class CalculateBillDiscount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the Bill Amount: ");
		// int billAmount= scanner.nextInt();
		float billAmount = scanner.nextFloat();

		System.out.print("Enter the Discount Percentage: ");
		// int discountPercentage= scanner.nextInt();
		float discountPercentage = scanner.nextFloat();

		// int Discount = billAmount * discountPercentage / 100;
		float discount = billAmount * discountPercentage / 100;
		System.out.println("Discount = " + discount);

	}

}
