//3. Convert the Fahrenheit calculation program to get Celsius input using keyboard. - Page 15

package assignment;

import java.util.Scanner;

public class CelsiusCalculation {

	public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Enter Fahrenheit value: ");
      int fahrenheitValue= scanner.nextInt();
     // double fahrenheit = scanner.nextDouble();
      
      int celsius =(int) (( 5 *(fahrenheitValue - 32.0)) / 9.0);
    //  double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
      
     // System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
      System.out.println("celsius = " + celsius);	
      
      
	}

}
