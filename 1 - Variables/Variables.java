class Variables {

	// basic number and string manipulation

	public static void main(String[] args) {

		// console output
		System.out.println("hello world!");
		System.out.println("System.out.println() is going to be your primary debugging tool for this course. It lets you see what's going on in your code, and you'll be blind without it");
		System.out.println("It prints anything to the console, like the number three: " + 3);

		// System.exit(0);
		System.out.println("-------------------------------");

		// the ultimate difference between python and java is that java is not dynamically typed
		// this means you need to declare a type for every single variable you use
		// for this example, we're using int, or integer, which just refers to whole numbers

		int number = 12;
		System.out.println("number is: " + number);
		number = number + 6;
		System.out.println("number after adding 6 is: " + number);
		number -= 10; // same thing as `number = number - 10`
		System.out.println("number after subtracting 10 is: " + number);
		// multiplication (*), division (/), and modulo (%) are other common operators
		// notably, division with integers always rounds down
		System.out.println("is number equal to 8? " + (number == 8));
		System.out.println("is number less than or equal to 7? " + (number <= 7));

		// System.exit(0);
		System.out.println("-------------------------------");

		double otherNumber = number + 0.5; // doubles store decimals
		System.out.println("otherNumber is " + otherNumber);
		number = (int)otherNumber; // if precision is lost, you need to make the type change explicit (this is called casting)
		System.out.println("number is " + number);

		// System.exit(0);
		System.out.println("-------------------------------");

		// strings and characters

		String word = "bcd";
		word += "efg";
		char character = 'a';
		word = character + word;
		System.out.println("word is: " + word);

		// string comparisons need to use .equals() instead of ==
		System.out.println("word == \"abcdefg\" " + (word == "abcdefg"));
		System.out.println("word.equals(\"abcdefg\") " + (word.equals("abcdefg")));

	}
}
