import java.util.Scanner;

public class WebUrlChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Website address:");
		String url = scanner.nextLine();
		
		if (url.startsWith("http://") || url.startsWith("https://"))
        {
			System.out.println("This is a Web Url.");
		}else{
			System.out.println("This is NOT Web Url.");
		}
		

	}

}
