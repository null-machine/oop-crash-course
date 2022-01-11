/*
Student name: Glen Wang
Course: ITI 1121
Lab section: B-1
*/

class Q5 {

	// main provided by professors, do not modify
	public static void main(String[] args){

		boolean[] test = new boolean[8];

		//test for isPrime
		test[0]  = (isPrime(0) == false);
		test[1] = (isPrime(2) == true);
		test[2] = (isPrime(7) == true);
		test[3] = (isPrime(15) == false);

		test[4]  = (getFibonacci(1) == 1);
		test[5]  = (getFibonacci(3) == 2);
		test[6]  = (getFibonacci(5) == 5);
		test[7]  = (getFibonacci(8) == 21);


		boolean testFlag=true;
		for (int i = 0; i < test.length; i++){
			if(test[i]){
				System.out.println("test " + i + " passed");
			} else {
				System.out.println("test " + i + " failed");
				testFlag = false;
			}
		}

		if(testFlag){
			System.out.println("All tests are successful");
		} else {
			System.out.println("Not all tests are successful");
		}

	}

	/**
	*
	* method that determines if the number x is prime
	*
	* @param x  the number
	* @return boolean  whether it's prime
	*/
	public static boolean isPrime(int x) {
		if (x < 2) return false;
		for (int i = 2; i * i <= x; i++) if (x % i == 0) return false;
		return true;
	}

	/**
	*
	* returns the fibonacci number at the position in parameter
	*
	* @param position  the position
	* @return the fibonacci number
	*/
	public static int getFibonacci(int position) {
		if (position < 2) return position;
		int temp;
		int prev = 0;
		int current = 1;
		for (int i = 1; i < position; i++) {
			temp = current;
			current += prev;
			prev = temp;
		}
		return current;
	}

	// not sure what the placeholder code was trying to do, but
	// these implementations are more intuitive for me
}
