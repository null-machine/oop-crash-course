class Functions {

	public static void main(String[] args) {
		function();
		System.out.println("------------");
		int x = increment(5);
		System.out.println(x);
		System.out.println("------------");

		String[] array = { "one", "two", "three" };
		array = swap(array, 0, 1);
		System.out.println(array[0] + " " + array[1] + " " + array[2]);
		System.out.println("------------");

		System.out.println(increment(5, 10));
		System.out.println("------------");

		recursionDemo(0);
	}

	static void function() {
		System.out.println("ahoy");
	}

	static int increment(int number) {
		System.out.println("increment called");
		return number + 1;
	}

	static String[] swap(String[] words, int indexA, int indexB) {
		// if (indexA < 0 || indexB < 0 || indexA >= words.length || indexB >= words.length) {
		// 	System.out.println("invalid indexes");
		// 	return;
		// }
		String buffer = words[indexA];
		words[indexA] = words[indexB];
		words[indexB] = buffer;
		return words;
	}

	// overloaded functions have the same name but different parameters
	static int increment(int number, int other) {
		System.out.println("increment with two parameters called");
		return number + other;
	}

	static void recursionDemo(int iteration) {
		if (iteration >= 10) {
			return;
		}
		System.out.println("recursive call number: " + iteration);
		recursionDemo(iteration + 1);
	}
}
