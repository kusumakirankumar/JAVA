package arrays;

public class OddNumbersInArray {
	public static void main(String[] args) {
		int[] arr = { 9, 1, 8, 2, 7, 3, 6, 4, 5, 0 };
		// Iterating loop through array
		for (int i = 0; i < arr.length; i++) {
			// Checking the condition for odd number present at index of array
			if (arr[i] % 2 == 1) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
