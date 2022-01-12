import java.util.Scanner;

class Conditionals {

	public static void main(String[] args) {

		boolean flagA = true;
		boolean flagB = false;
		if (flagA) {
			System.out.println("flagA is true");
		} else if (flagB) {
			System.out.println("flagA is false and flagB are true");
		} else {
			System.out.println("flagA and flagB are false");
		}
		System.out.println("------------");

		System.out.println("1 - apple, 2 - banana, 3 - cherry");
		Scanner input = new Scanner(System.in);
		int selection = input.nextInt();
		switch (selection) {
			case 1:
			System.out.println("apple selected");
			break;
			case 2:
			System.out.println("banana selected");
			break;
			case 3:
			System.out.println("cherry selected");
			break;
			default:
			System.out.println("invalid selection");
			break;
		}

		// same thing as
		// if (selection == 1) {
		// 	System.out.println("apple selected");
		// } else if (selection == 2) {
		// 	System.out.println("banana selected");
		// } else if (selection == 3) {
		// 	System.out.println("cherry selected");
		// } else {
		// 	System.out.println("invalid selection");
		// }
	}
}
