import java.util.Scanner;

public class VoteEligibilityChecker {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the age:");
		int age= scanner.nextInt();
		
	
		//if(age>=18)  
		if(age>18) {
			System.out.println("Eligible to vote");
		}else {
			System.out.println("Not Eligible to vote");
			
			scanner.close();
		}
	}

}
