package arrayConcept;

public class Example2 {

	public static void main(String[] args) {

		int[] n = new int[10];

		n[0] = 100;
		n[1] = 333;
		n[2] = 15829;
		n[3] = 143;
		n[4] = 12;
		n[5] = 455;
		n[6] = 190;
		n[7] = 123;
		n[8] = 142;
		n[9] = 183;

		System.out.println("\nCorrect order");

		// for print all info
		for (int i = 0; i <= 9; i++) {
			System.out.println(n[i]);
		}

		System.out.println("\nReverse order");

		// for reverse info
		for (int j = 9; j >= 0; j--) {
			System.out.println(n[j]);
		}

		String[] name = new String[5];

		name[0] = "Hemant";
		name[1] = "Aniket";
		name[2] = "Omkar";
		name[3] = "Vishal";
		name[4] = "Niraj";

		System.out.println("\nPrint name sequentisl order");

		// for sequential order
		for (int k = 0; k <= 4; k++) {
			System.out.println(name[k]);
		}

		System.out.println("\nPrint name in reverse order");

		// for reverse order
		for (int l = 4; l >= 0; l--) {
			System.out.println(name[l]);
		}

	}
}
