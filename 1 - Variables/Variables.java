class Variables {

	public static void main(String[] args) {

		// the ultimate difference between python and java is that java is not dynamically typed
		// this means you need to declare a type for every single variable you use
		// for this example, we're using int, or integer, which just refers to whole numbers

		int number = 12;
		System.out.println("number is: " + number);
		number = number + 6;
		System.out.println("number after adding 6 is: " + number);
		number = number / 5; // same thing as `number = number - 10`
		System.out.println("number after dividing by 5 is: " + number);
		// subtraction (-), division (/), and modulo (%) are other common operators
		System.out.println("-------------------------------");

		boolean equalsThree = (number == 3);
		System.out.println("is number equal to 3? " + equalsThree);
		System.out.println("is number greater than or equal to 7? " + (number >= 7));
		System.out.println("-------------------------------");

		double otherNumber = number; // doubles store decimals
		otherNumber = otherNumber + 0.7;
		System.out.println("otherNumber is " + otherNumber);
		number = (int)otherNumber; // if precision is lost, you need to make the type change explicit (this is called casting)
		System.out.println("number is " + number);

		System.out.println("-------------------------------");

		// strings and characters

		String word = "bcd";
		word += "efg";
		char character = 'a';
		word = character + word;
		System.out.println("word is: " + word);

	}
}
