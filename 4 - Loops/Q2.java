import java.util.Scanner;

class Q1 {

	// Write a program that checks if a number given by the user is prime.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Input an integer: ");
		int number = input.nextInt();

		boolean prime = true;

		if (number < 2) prime = false;
		for (int i = 2; i * i <= number; i++) {
			if (number % i == 0) {
				prime = false;
			}
		}

		if (prime) {
			System.out.println(number + " is prime.");
		} else {
			System.out.println(number + " is not prime.");
		}
	}
}
