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
		int k = 0;
		do {
			System.out.print(k + " ");
			k++;
		} while (k < 10);

		// with a really cursed while loop
		// int l = 0;
		// for (; l < 10;) {
		// 	System.out.print(l + " ");
		// 	l++;
		// }

		System.out.println("----------");

		int factorialNumber = 9;
		int factorial = 1;
		for (int i = 1; i <= factorialNumber; i++) {
			factorial *= i;
		}
		System.out.println("the factorial of " + factorialNumber + " is " + factorial);
	}
}
