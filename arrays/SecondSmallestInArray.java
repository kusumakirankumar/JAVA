package arrays;

public class SecondSmallestInArray {
	public static void main(String[] args) {
		int[] arr = { 9, 1, 8, 2, 7, 3, 6, 4, 5, 0 }; // Initializing array

		// Bubble sorting
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j + 1] > arr[j]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		// Printing sorted array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// Printing second smallest element
		System.out.print(arr[arr.length - 2]);
	}
}
