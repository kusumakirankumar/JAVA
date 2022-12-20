package programs;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		boolean b = false;
		sc.close();
		// Checking the number is not negative
		if (num <= 0) {
			return;
		}
		// Finding the number is Prime or Not
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				b = true;
				break;
			}
		}
		// Checking not True condition
		if (!b) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}
}
