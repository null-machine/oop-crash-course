class Q4 {

	static int[] insertIntoArray(int[] beforeArray, int indexToInsert, int valueToInsert){
		int[] afterArray = new int[beforeArray.length + 1];
		for (int i = 0; i < afterArray.length; i++) {
			if (i < indexToInsert) {
				 afterArray[i] = beforeArray[i];
			 } else if (i == indexToInsert) {
				 afterArray[i] = valueToInsert;
			 } else {
				 afterArray[i] = beforeArray[i - 1];
			 }
		}
		return afterArray;
	}

	public static void main(String[] args) {
		int[] array = new int[] { 1, 5, 4, 7, 9, 6 };
		int insertIndex = 3;
		int insertValue = 15;
		System.out.println("Array before insertion:");
		for (int num : array) System.out.println(num);
		System.out.printf("Array after insertion of %d at position %d:%n", insertValue, insertIndex);
		array = insertIntoArray(array, insertIndex, insertValue);
		for (int num : array) System.out.println(num);
	}
}
