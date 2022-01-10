/*
Student name: Glen Wang
Course: ITI 1121
Lab section: B-1
*/

class Q3_AverageDemo {

	public static void main(String[] args){
		double[] valuesArray;
		valuesArray = new double[] { 100.0, 34.0, 72.0, 56.0, 82.0, 67.0, 94.0 };
		System.out.println("The average is: " + calculateAverage(valuesArray));
	}


	/**
	*
	* Method that calculates the average of the numbers in an array
	*
	* @param values  the values
	* @return double  the average
	*/
	public static double calculateAverage(double[] values) {
		double result = 0.0;
		for (double num : values) result += num;
		return result / values.length;
	}
}
