package First_Sep_Wednesday;

import java.util.Scanner;

public class Menuu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner scanner= new Scanner(System.in);

		while (true) {

			System.out.println("Menu");
			System.out.println("=====");
			System.out.println("1. Balanace Enquiry");
			System.out.println("2. Recharge");
			System.out.println("3. Change Caller Tune");
			System.out.println("4. Exit");

			Scanner scanner = new Scanner(System.in);
			System.out.println("Choose an option:");
			int option = scanner.nextInt();

			switch (option) {
			case 1:
				System.out.println("Balanace Enquiry");
				break;
			case 2:
				System.out.println("Recharge");
				break;
			case 3:
				System.out.println("Change Caller Tune");
				break;
			case 4:
				System.out.println("Exit");

				// System.exit(0);...it breaks the exit chain, but not good trick to apply this.
				// break;

			}
		}

	}
}
