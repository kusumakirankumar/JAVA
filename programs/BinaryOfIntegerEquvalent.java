package programs;

import java.util.Scanner;
import java.util.Stack;

public class BinaryOfIntegerEquvalent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		sc.close();
		while (num > 0) {
			int i = num % 2;
			stack.push(i);
			num /= 2;
		}
		System.out.print("Binary representation is: ");
		while (!(stack.isEmpty())) {
			System.out.print(stack.pop());
		}
		System.out.println();
	}
}
