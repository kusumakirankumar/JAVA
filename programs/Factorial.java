package programs;

import java.util.Scanner;

public class Factorial {
// Factorial of the given number
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		sc.close();
		int factorail = 1;

		// Iterating the loop till the given number becomes '1'

		for (int i = num; i > 0; --i) {
			factorail = factorail * i;
		}
		System.out.println("Factorial: " + factorail);
	}
}
