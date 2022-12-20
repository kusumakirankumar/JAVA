package recursion;

import java.util.Scanner;

public class Fibonacci {
	public static int fibonacci(int nums) {
		if (nums <= 1) {
			return nums;
		} else {
			return fibonacci(nums - 1) + fibonacci(nums - 2);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many numbers required: ");
		int nums = sc.nextInt();
		sc.close();
		System.out.print("Series is: ");
		for (int i = 0; i < nums; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}
}
