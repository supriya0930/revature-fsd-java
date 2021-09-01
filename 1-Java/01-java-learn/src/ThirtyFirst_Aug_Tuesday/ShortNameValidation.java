/*4. Validate Short Name - Page 23
Validate whether a text input by a user is within the expected range or not. For a given Short Name find 
out whether it has minimum 2 characters and maximum 6 characters */

package ThirtyFirst_Aug_Tuesday;

import java.util.Scanner;

public class ShortNameValidation {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the text:");
		String name = scanner.nextLine();

		if ((name.length() >= 2) && (name.length() <= 6)) {
			System.out.println("This is a valid short name.");
		} else {
			System.out.println("This is NOT a valid short name.");
		}

	}

}
