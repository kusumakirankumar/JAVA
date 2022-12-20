package arrays;

public class FactorialForEachNumberInArray {
	public static void main(String[] args) {
		// Initialize the array
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int factorial = 1;
		// Iterate the array elements
		for (int i = 0; i < arr.length; i++) {
			/*
			 * Iterate the each element in array It is also individual factorial of each
			 * element
			 */
			for (int j = arr[i]; j > 0;) {
				factorial = factorial * j;
				break;
			}
			System.out.println(factorial + "  ");
		}

	}
}
