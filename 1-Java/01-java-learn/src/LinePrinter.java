 //functions concept used here

public class LinePrinter {

	public static void main(String[] args) {
//		LinePrinter.printLine(); ...lineprinter is class name and printline is function

		printLine();
		printLine(15);
		printLine(10);
		printLine(25);
		
		int characterCount = 30;
		printLine(2*15,'$');
		
		//METHOD OVERLOADING EXAMPLE FROM println() FUNCTION
		System.out.println('A');
		System.out.println('1');
		System.out.println(2.05f);
		
		}

	public static void printLine() {
		System.out.println("----------------------");
	}
	
	
	//METHOD OVERLOADING- POLYMORPHISM
	public static void printLine(int numberOfCharacters) {
		for (int i = 0; i < numberOfCharacters; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	public static void printLine(int numberOfCharacters, char character) {
		for (int i = 0; i < numberOfCharacters; i++) {
			System.out.println(character);
		}
		System.out.println();
	}

}


//when u r in same class ,we define main method and through main method,we call function
//