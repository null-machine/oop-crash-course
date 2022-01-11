class Arrays {

	public static void main(String[] args) {

		int[] array = new int[5];
		array[0] = 413;
		array[2] = 612;
		array[4] = 1025;

		// can't print arrays directly! you'll print the memory address where they're stored.
		System.out.println("attempting to print an array: " + array);

		// instead, we use a loop:
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
			array[i] = 1000;
		}
		System.out.println();

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();


		String[] namesA = { "basil", "sunny", "aubrey", "kel" };
		// is the same as
		String[] namesB = new String[4];
		namesB[0] = "basil";
		namesB[1] = "sunny";
		namesB[2] = "aubrey";
		namesB[3] = "kel";

		// 2d arrays exist as well
		int[][] gridA = new int[3][4];
		gridA[1][2] = 42;
		char[][] gridB = {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'}
		};
		System.out.println(gridB[1][1]);


		// for-each loops probably aren't a requirement for this course, but considering how much
		// time they've saved me, i'd say they're worth mentioning for completeness.

		System.out.println("for-each loop");
		for (String name : namesA) {
			System.out.print(name + "\t");
			// notably, you cannot set using the declared item
			// e.g. `name = "mari";` here would result in a crash
		}
		// is the same as
		System.out.println("\nfor loop");
		for (int i = 0; i < namesA.length; i++) {
			System.out.print(namesA[i] + "\t");
		}
	}
}
