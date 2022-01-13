// when we want to use scanner, we need to explicitly tell the compiler we're using it
import java.util.Scanner;

class Input {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // treat this as boilerplate code whenever you use scanner. it will make sense once classes and constructors are covered

		System.out.println("input a line: ");
		String line = input.nextLine(); // nextLine() reads the next string until a line break
		System.out.println("the line inputted is: " + line);

		System.out.println("----------------------");

		System.out.println("input a number: ");
		int number = input.nextInt(); // nextInt() reads the next number
		System.out.println("the number inputted is " + number);

		System.out.println("----------------------");

		System.out.println("input two words: ");
		String firstWord = input.next(); // next() reads the next string until the next whitespace
		String nextWord = input.next();
		System.out.println("the words inputted are " + firstWord + " " + nextWord);

		// whenever a question asks to take user input, the easiest way to do so is almost always scanner
		// if you're interested in reading from files or more performance, look into BufferedReader
	}
}
