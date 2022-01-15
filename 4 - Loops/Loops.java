class Loops {

	public static void main(String[] args) {

		System.out.println("printing 0-9");

		// with a for loop
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// with a while loop
		int j = 0;
		while (j < 10) {
			System.out.print(j + " ");
			j++;
		}
		System.out.println();

		// with a do-while loop
		int k = 10;
		do {
			System.out.print(k + " ");
			k++;
		} while (k < 10);
		System.out.println();

		System.out.println("----------");

		// loops can also be nested!
		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) {
				System.out.println(a + " " + b);
			}
		}

		System.out.println("----------");

		int factorialNumber = 9;
		int factorial = 1;
		for (int i = 1; i <= factorialNumber; i++) {
			factorial *= i;
		}
		System.out.println("the factorial of " + factorialNumber + " is " + factorial);
	}
}
