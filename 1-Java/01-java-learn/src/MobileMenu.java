import java.util.Scanner;

public class MobileMenu {

	public static void main(String[] args) {
		
		System.out.println("Menu");
		System.out.println("=====");
		System.out.println("1. Balanace Enquiry");
		System.out.println("2. Recharge");
		System.out.println("3. Change Caller Tune");

		Scanner scanner= new Scanner(System.in);
		System.out.println("Choose an option:");
		int option= scanner.nextInt();
		
		
		//try with if case......
		
		/*if (option == 1) {
			System.out.println("1. Balanace Enquiry");
		}else if (option == 2) {
			System.out.println("2. Recharge");
		}else if (option == 3) {
			System.out.println("3. Change Caller Tune");
		}*/
		
		
		//now try with switch case.....
		
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
		}
	}

}
