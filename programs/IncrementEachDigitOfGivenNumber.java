package programs;

import java.util.Scanner;

public class IncrementEachDigitOfGivenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int rem, n = 0;
		sc.close();
		while (num > 0) {
			rem = num % 10;
			rem++;
			n = n * 10 + rem;
			num = num / 10;
		}
		num = n;
		n = 0;
		while (num > 0) {
			rem = num % 10;
			n = n * 10 + rem;
			num = num / 10;
		}
		System.out.print("Incremented digits of given number is: " + n + " ");
	}
}
