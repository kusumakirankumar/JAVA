package programs;

import java.util.Scanner;

public class Smallest {
	// Finding smallest using Conditional Operators
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		System.out.print("Enter c: ");
		int c = sc.nextInt();
		sc.close();
		int smallest = c < (a < b ? a : b) ? c : (a < b ? a : b);// Logic to find smallest number
		System.out.println("Smallest number: " + smallest);
	}
}
