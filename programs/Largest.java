package programs;

import java.util.Scanner;

public class Largest {
	// Finding largest of three using Conditional operators
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		System.out.print("Enter c: ");
		int c = sc.nextInt();
		sc.close();
		int largest = c > (a > b ? a : b) ? c : (a > b ? a : b); // Logic to find the largest
		System.out.println("Largest number is: " + largest);
	}
}
