package patterns;

import java.util.Scanner;

public class RightAngledTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();
		sc.close();
		for (int i = size; i > 0; i--) {
			for (int j = 0; j < size - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
