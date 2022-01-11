import java.util.Scanner;

class Q1 {

	// Write a program that gets three integers from the user and calculates their average as a double.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Input three integers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		double average = (a + b + c) / 3.0;
		System.out.println("The average is: " + average);

	}
}
