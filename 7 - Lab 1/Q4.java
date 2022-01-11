/*
Student name: Glen Wang
Course: ITI 1121
Lab section: B-1
*/

class Q4 {


	/**
	*
	* Create an array with elements equal to the squares of their indices
	*
	* @param size  the size of the array
	* @return int[] the array
	*/
	public static int[] createArray(int size) {
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = i * i;
		}
		return array;
	}

	// runs the program
	public static void main(String[] args) {

		int[] array = createArray(13);
		for (int i = 0; i < array.length; i++) {
			System.out.printf("The square of %d is: %d%n", i, array[i]);
		}
	}
}
