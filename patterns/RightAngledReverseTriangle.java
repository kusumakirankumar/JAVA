package patterns;

import java.util.Scanner;

public class RightAngledReverseTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();
		sc.close();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
