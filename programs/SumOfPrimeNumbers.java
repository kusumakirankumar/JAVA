package programs;

import java.util.Scanner;

public class SumOfPrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range: ");
		int range = sc.nextInt();
		int sum = 0;
		sc.close();
		for (int i = 1; i <= range; i++) {
			int count = 0;
			if (i <= 0) {
				return;
			}
			for (int j = 1; j <= range; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				sum += i;
			}
		}
		System.out.print("Sum is: " + sum);
	}
}
