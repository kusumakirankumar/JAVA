package programs;

import java.util.Scanner;

public class PrintCharsFromGivenChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // scanner class
		System.out.print("Enter the alphabet: ");
		char ch = sc.next().charAt(0); // taking char input
		sc.close(); // scanner class closed
		int count = 0; // initialized count value
		while (count != 5) { // while condition to iterate 5 times
			ch++; // next position value of given input
			System.out.print(ch + " "); // printing output
			count++; // incrementing count value
		}
	}
}
