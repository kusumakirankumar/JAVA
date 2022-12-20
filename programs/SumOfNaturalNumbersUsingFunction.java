package programs;

import java.util.Scanner;

public class SumOfNaturalNumbersUsingFunction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range: ");
		int num = sc.nextInt();
		sc.close();
		int sum = num * (num - 1) / 2;
		System.out.print(sum);
	}
}
