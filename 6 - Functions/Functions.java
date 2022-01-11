class Functions {

	public static void main(String[] args) {
		function();
		System.out.println("------------");

		System.out.println(increment(5));
		System.out.println("------------");

		String[] array = { "one", "two" };
		swap(array, 0, 1);
		System.out.println(array[0] + " " + array[1]);
		System.out.println("------------");

		System.out.println(increment(5, 10));
	}

	static void function() {
		System.out.println("ahoy");
	}

	static int increment(int number) {
		System.out.println("increment called");
		return number + 1;
	}

	// arrays are passed by reference, which means that changes made to them in the function will affect the array
	static void swap(String[] words, int indexA, int indexB) {
		// if (indexA < 0 || indexB < 0 || indexA >= words.length || indexB >= words.length) {
		// 	System.out.println("invalid indexes");
		// 	return;
		// }
		String buffer = words[indexA];
		words[indexA] = words[indexB];
		words[indexB] = buffer;
	}

	// overloaded functions have the same name but different parameters
	static int increment(int number, int other) {
		System.out.println("increment with two parameters called");
		return number + other;
	}
}
