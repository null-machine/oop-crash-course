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

			/*
			0	0	0	0	0	0	0	0	0	0
			0	1	2	3	4	5	6	7	8	9
			0	2	4	6	8	10	12	14	16	18
			0	3	6	9	12	15	18	21	24	27
			0	4	8	12	16	20	24	28	32	36
			0	5	10	15	20	25	30	35	40	45
			0	6	12	18	24	30	36	42	48	54
			0	7	14	21	28	35	42	49	56	63
			0	8	16	24	32	40	48	56	64	72
			0	9	18	27	36	45	54	63	72	81
			*/
		}
	}
}
