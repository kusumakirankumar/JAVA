package exceptions;

import java.util.Scanner;

public class TryCatchMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A value: ");
		int a = sc.nextInt();
		System.out.print("Enter B value: ");
		int b = sc.nextInt();
		int c;
		try {
			c = a / b;
		} catch (ArithmeticException e) {
			System.out.println("The denominator should not be zero.");
			System.out.print("Enter the valid input: ");
			b = sc.nextInt();
			c = a / b;
			sc.close();
		}
		System.out.println("Answer is: " + c);
	}
}
