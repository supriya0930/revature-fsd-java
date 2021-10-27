package default_package;

import java.util.Scanner;

public class checkingAlphabets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String string = sc.nextLine();
		string = string.toLowerCase();
		int count = 0;
		for (char i = 'a'; i < 'z'; i++) {
			if (string.indexOf(i) == -1) {
				count++;
			}

		}
		if (count >= 26) {
			System.out.println(" pangram");
		} else {
			System.out.println(" not pangram");
		}
	}
}


public static String pangrams(String s) {
    // Write your code here


    Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string :");
        String string= sc.nextLine();
        string= string.toLowerCase();
        int count=0;
        for(char i ='a'; i<'z'; i++) {
            if(string.indexOf(i) == -1) {
                count++;
        }
                
    }
    if(count>=26) {
        return "pangram";
    }
    else {
        return "not pangram";
    }
  }