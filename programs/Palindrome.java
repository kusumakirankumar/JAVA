package programs;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int sum = 0;
		int equal = num;
		sc.close();
		while (num != 0) {
			int rem = num % 10; // It gives us the remainder
			sum = sum * 10 + rem; // It stores the result of each time we have the remainder
			num = num / 10; // It gives us quotient
		}
		if (equal == sum) {
			System.out.println(equal + " is Palindrome ");
		} else {
			System.out.println(equal + " is not palindrome ");
		}
	}
}
