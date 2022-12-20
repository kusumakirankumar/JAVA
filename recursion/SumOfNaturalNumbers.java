package recursion;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static int sum(int i) {
		if (i != 1) {
			return i + sum(i - 1);
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range: ");
		int i = sc.nextInt();
		sc.close();
		System.out.println("Sum is: " + sum(i));
	}
}
