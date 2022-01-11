class Loops {

	public static void main(String[] args) {

		System.out.println("printing 0-9");

		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		int j = 0;
		while (j < 10) {
			System.out.print(j + " ");
			j++;
		}
		System.out.println();

		int k = 0;
		do {
			System.out.print(k + " ");
			k++;
		} while (k < 10);
		System.out.println("----------");

		int factorialNumber = 9;
		int factorial = 1;
		for (int i = 1; i <= factorialNumber; i++) {
			factorial *= i;
		}
		System.out.println("the factorial of " + factorialNumber + " is " + factorial);
	}
}
