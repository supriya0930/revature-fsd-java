package First_Sep_Wednesday;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("Menu");
			System.out.println("=====");
			System.out.println("1. Balanace Enquiry");
			System.out.println("2. Recharge");
			System.out.println("3. Change Caller Tune");
			System.out.println("4. Exit");

			System.out.println("Choose an option:");
			int option = scanner.nextInt();

			if (option == 1) {

				System.out.println("Balanace Enquiry");
			}

			if (option == 2) {
				System.out.println("Recharge");
			}
			if (option == 3) {
				System.out.println("Change Caller Tune");
			}
			if (option == 4) {
				System.out.println("Exit");
				break;
			} else {
				System.out.println("Enter a valid choice");
			}

		}

	}
}
