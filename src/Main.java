import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Въведи число:");
		int number = in.nextInt();

		if (1 <= number && number <= 5) {
			if (number % 2 == 0) {
				System.out.println("The number is even!");
			} else {
				System.out.println("The number is odd!");
			}

		}
		if (6 <= number && number <= 15) {
			if (number % 3 == 0) {
				System.out.println("The number is integer!");
			} else {
				System.out.println("The number is not integer!");
			}

		}
		if (number == 0) {
			System.out.println("The number is zero!");
		}
		if (number > 15) {
			System.out.println("Positive number!");
		}
		if (number < 0) {
			System.out.println("Negative number!");
		}
	}
}
