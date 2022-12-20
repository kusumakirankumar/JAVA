package sorting;

public class QuickSort {
	public static void join(int arr[], int start, int mid, int end) {
		int joined[] = new int[end - start + 1];
		int idx1 = start;
		int idx2 = mid + 1;
		int x = 0;
		while (idx1 <= mid && idx2 <= end) {
			if (arr[idx1] <= arr[idx2]) {
				joined[x++] = arr[idx1++];
			} else {
				joined[x++] = arr[idx2++];
			}
		}
		while (idx1 <= mid) {
			joined[x++] = arr[idx1++];
		}
		while (idx2 <= end) {
			joined[x++] = arr[idx2++];
		}
		for (int i = 0, j = start; i < joined.length; i++, j++) {
			arr[j] = joined[i];
		}
	}

	public static void divide(int arr[], int start, int end) {
		if (start >= end) {
			return;
		}
		int mid = start + (end - start) / 2;
		divide(arr, start, mid);
		divide(arr, mid + 1, end);
		join(arr, start, mid, end);
	}

	public static void main(String[] args) {
		int arr[] = { 9, 1, 8, 0, 2, 5, 3, 6, 4, 7, 10 };
		int n = arr.length - 1;
		divide(arr, 0, n);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
