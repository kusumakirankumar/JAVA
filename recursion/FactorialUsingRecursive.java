package recursion;

import java.util.Scanner;

public class FactorialUsingRecursive {

	static int factorial(int num) {
		if (num != 0) {
			return num * factorial(num - 1);
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		sc.close();
		int result = factorial(num);
		System.out.println("Factorial is: " + result);
	}
}
