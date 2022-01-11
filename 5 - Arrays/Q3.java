class Q3 {
	// Write a program that constructs and prints a 10 by 10 array with each element equal to the product of its indices.

	public static void main(String[] args) {
		int[][] array = new int[10][10];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = i * j;
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
