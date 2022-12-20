package sorting;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 9, 1, 8, 2, 7, 3, 6, 4, 5, 0, 10 };
		for (int i = 0; i < arr.length; i++) { // Loop through array
			for (int j = 0; j < arr.length - 1 - i; j++) { // Loop for arranging the elements
				if (arr[j] > arr[j + 1]) { // Sorting algorithm "change condition for ascending or descending"
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
