package programs;

import java.util.Scanner;

public class SumOfNaturalNumbers {
// Sum of N natural numbers
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int sum = 0;
		sc.close();
		for (int i = 0; i <= num; i++) {
			sum += i;
		}
		System.out.println("Sum is: " + sum);
	}
}
