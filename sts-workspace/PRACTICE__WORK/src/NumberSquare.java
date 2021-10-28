import java.util.Scanner;

public class NumberSquare {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sqr = num * num;
		int no = 1;
		String str = Integer.toString(num);
		int n = str.length();
		System.out.println(n);
		for (int i =n; i> 0; i--) {
			num = num * 10;
		}
		
			 int right = sqr % num;
			int left = sqr / num ;
	    //  System.out.println("right");
	    
		 int sum = right +left;
		 
			 System.out.println("sum");
			 
		 if (sum == num) {
			 System.out.println("yes");
		 }
		 
		 else {
			 System.out.println("no");
		 }
	
		
		
		
	}

}
