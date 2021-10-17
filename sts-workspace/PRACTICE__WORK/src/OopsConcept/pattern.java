package OopsConcept;

public class pattern {

	public static void main(String[] args) {
		int n = 5;

		for (int r = 0; r < n; r++) {
			for (int c = 0; c < n; c++) {
				if (c == n / 2 || r == n / 2)

					System.out.print("0");
				else
					System.out.println("1");
			}
			System.out.println();
		}

	}

}
