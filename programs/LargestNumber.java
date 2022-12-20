package programs;

import java.util.Scanner;

public class LargestNumber {
// Largest Number using Logical Operators and Conditional Operators

// Reverse the conditions for the Smallest of the number

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		System.out.print("Enter c: ");
		int c = sc.nextInt();
		sc.close();
		if (a > b && a > c) { // checking "a" is largest
			System.out.println("Largest: " + a);
		} else if (b > a && b > c) { // Checking "b" is largest
			System.out.println("Largest: " + b);
		} else { // If both are false "c" is largest
			System.out.println("Largest: " + c);
		}
	}
}
