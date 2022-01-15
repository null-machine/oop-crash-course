class Variables {

	public static void main(String[] args) {

		// the ultimate difference between python and java is that java is not dynamically typed
		// this means you need to declare a type for every single variable you use
		// for this example, we're using int, or integer, which just refers to whole numbers

		int number = 413;
		System.out.println("number is: " + number);
		number += 612;
		System.out.println("number after adding 612 is: " + number);
		System.out.println("number % 10 is " + (number % 10));
		number = number / 500; // same thing as `number = number - 10`
		System.out.println("number after dividing by 500 is: " + number);
		System.out.println("-------------------------------");

		boolean equalsOne = (number == 1);
		System.out.println("is number equal to 1? " + equalsOne);
		System.out.println("is number greater than or equal to 7? " + (number < 7));
		System.out.println("-------------------------------");

		double otherNumber = number; // doubles store decimals
		otherNumber = otherNumber + 0.7;
		System.out.println("otherNumber is " + otherNumber);
		number = (int)otherNumber; // if precision is lost, you need to make the type change explicit (this is called casting)
		System.out.println("number is " + number);

		otherNumber = 15 / 4.0; // be careful about data types! even though otherNumber is a double,
		// 15 and 4 are integers, so this will perform integer division instead of double division,
		// resulting in the loss of the decimal point. to fix this, cast the numbers!
		System.out.println("15 / 4 = " + otherNumber);

		System.out.println("-------------------------------");

		// strings and characters

		String word = "bcd";
		System.out.println("word: " + word);
		word = word + "efg";
		System.out.println("word + \"efg\": " + word);
		char character = 'a';
		word = character + word;
		System.out.println("'a' + word: " + word);

	}
}
