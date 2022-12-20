package sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 9, 1, 8, 2, 7, 3, 6, 4, 5, 0, 10 };
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					int temp = arr[j];
					arr[j] = arr[min];
					arr[min] = temp;
					min = i;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
