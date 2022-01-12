class Q4 {

	// Write a function that takes an int[] array, an int value, and an int index that returns a new int[] array with the value inserted at the index specified.

	static int[] insertIntoArray(int[] array, int index, int value){
		int[] newArray = new int[array.length + 1];
		for (int i = 0; i < newArray.length; i++) {
			if (i < index) {
				 newArray[i] = array[i];
			 } else if (i == index) {
				 newArray[i] = value;
			 } else {
				 newArray[i] = array[i - 1];
			 }
		}
		return newArray;
	}

	public static void main(String[] args) {
		int[] array = new int[] { 1, 5, 4, 7, 9, 6 };
		int insertIndex = 3;
		int insertValue = 15;
		System.out.println("Array before insertion:");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.printf("Array after insertion of %d at position %d:%n", insertValue, insertIndex);
		array = insertIntoArray(array, insertIndex, insertValue);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
