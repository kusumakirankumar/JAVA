package programs;

import java.util.Scanner;

public class PerfectNumberOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		sc.close();
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		if (sum == num) {
			System.out.print("Perfect number");
		} else {
			System.out.print("Not perfect number");
		}
	}
}
