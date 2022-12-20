package programs;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range: ");
		int range = sc.nextInt();
		sc.close();
		// Loop for natural numbers
		for (int i = 1; i < range; i++) {
			int count = 0;
			// Condition to check negative number
			if (i <= 0) {
				return;
			}
			// Loop to find primes
			for (int j = 1; j < range; j++) {
				// Checking for the number is divided or not if divided it is prime
				if (i % j == 0) {
					count++;
				}
			}
			// If number repeated two times then it is a prime
			if (count == 2) {
				System.out.print(i + " ");
			}
		}
	}
}
