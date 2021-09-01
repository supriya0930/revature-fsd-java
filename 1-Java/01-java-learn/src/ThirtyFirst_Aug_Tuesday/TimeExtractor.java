//5. Given a time in “hh:mm:ss” format extract the minutes - Page 24

package ThirtyFirst_Aug_Tuesday;

import java.util.Scanner;

public class TimeExtractor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter time in hour:");
		int hr = scanner.nextInt();

		System.out.println("Enter time in minute:");
		int min = scanner.nextInt();

		System.out.println("Enter time in seconds:");
		int sec = scanner.nextInt();

		System.out.println("Time is :" + hr + ":" + min + ": +sec");
		System.out.println("minutes: " + min);

	}

}
