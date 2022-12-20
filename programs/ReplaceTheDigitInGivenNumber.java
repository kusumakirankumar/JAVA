package programs;

import java.util.Scanner;

public class ReplaceTheDigitInGivenNumber {
	public static void main(String[] args) {
		// Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		// Input number
		int num = sc.nextInt();
		System.out.print("Enter digit want to change: ");
		// Input key in char because we are converting the input number into char array
		// to accessing each digit
		char key = sc.next().charAt(0);
		System.out.print("Enter digit want to replace: ");
		// Input value in char because we are converting the input number into char
		// array to accessing each digit
		char value = sc.next().charAt(0);
		sc.close();
		// Given number is converted to char array
		char[] ch = ("" + num).toCharArray();
		// Traverse of array
		for (int i = 0; i < ch.length; i++) {
			// Checking for the key value
			if (ch[i] == key) {
				// Changing the value
				ch[i] = value;
			}
		}
		// Printing the final changed number
		System.out.print("Final number is: ");
		for (int j = 0; j < ch.length; j++) {
			System.out.print(ch[j]);
		}
	}
}
