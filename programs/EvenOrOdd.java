package programs;

import java.util.Scanner;

public class EvenOrOdd {
//Even or Odd using BitWise Operators
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		sc.close();
		if ((number & 1) == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}
}
