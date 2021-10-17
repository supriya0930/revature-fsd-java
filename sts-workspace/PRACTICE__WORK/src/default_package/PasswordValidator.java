
//Enter a password
//check it to be string enough with following rules

//at least 8 characters
//at least 1 uppercase
//at least 1 lowercase
//at least 1 special character
//at least 1 digit

//pwd is strong enough
//pwd missing uppercase
//pwd missing lowercase
//pwd missing digit
//pwd missing special character
//pwd length less than 8
//From Sharad Singh to Everyone:  10:02 AM

public static void main(String[] args) {
		String pwd ="AbcA@123";
		int uc=0, lc=0, dc=0, sc=0;
		for (int i = 0; i < pwd.length(); i++) {
			char ch = pwd.charAt(i);
			if(Character.isUpperCase(ch)) {
				uc++;
			}
			else if(Character.isLowerCase(ch)) {
				lc++;
			} 
			else if(Character.isDigit(ch)) {
				dc++;
			}
			else {
				sc++;
			}
		}
		if(pwd.length()>=8 && uc>0 && lc>0 && dc>0 && sc>0) {
			System.out.println("Password is strong enough...");
		}
		else {
			if(pwd.length()< 8) {
				System.out.println("Pwd should have at least 8 chars");
			}
			if(uc==0)
				System.out.println("Uppercase missing");
			if(lc==0)
				System.out.println("Lowercase missing");
			if(dc==0)
				System.out.println("Digit missing");
			if(sc==0)
				System.out.println("Special Character missing");
		}
	}
