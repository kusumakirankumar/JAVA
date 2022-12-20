package programs;

import java.util.Scanner;

public class SquareOfGivenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		sc.close();
		num *= num;
		System.out.println("Square is: " + num);
	}
}
