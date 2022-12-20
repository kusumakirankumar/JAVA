package programs;

import java.util.Scanner;

public class SwappingTwoNumbers {
	// Swapping two numbers using Arithmetic Operators
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		sc.close();
		b = (a + b) - (a = b);
		System.out.println("a: " + a + "\nb: " + b);
	}
}
