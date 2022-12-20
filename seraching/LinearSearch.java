package seraching;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.print("Enter search element: ");
		int key = sc.nextInt();
		sc.close();
		for (int i = 0; i < arr.length; i++) { // Loop through array
			if (arr[i] == key) { // Searching for key
				System.out.println("Element found at index: " + i);
				return;
			}
		}
		System.out.println("Element not found");
	}
}
