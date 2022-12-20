package bothsearchsort;

import java.util.Scanner;

public class SortAndSearch {
	static void search(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				System.out.print("\nelement is found at index: " + (i + 1));
			}
		}
	}

	static void concur(int[] arr1, int si, int mid, int ei) {
		int[] arr2 = new int[ei - si + 1];
		int x = si;
		int y = mid + 1;
		int z = 0;
		while (x <= mid && y <= ei) {
			if (arr1[x] <= arr1[y]) {
				arr2[z++] = arr1[x++];
			} else {
				arr2[z++] = arr1[y++];
			}
		}
		while (x <= mid) {
			arr2[z++] = arr1[x++];
		}
		while (y <= ei) {
			arr2[z++] = arr1[y++];
		}
		for (int i = 0, j = si; i < arr2.length; i++, j++) {
			arr1[j] = arr2[i];
		}
	}

	static void divide(int[] arr1, int si, int ei) {
		if (si >= ei) {
			return;
		}
		int mid = si + (ei - si) / 2;
		divide(arr1, si, mid);
		divide(arr1, mid + 1, ei);
		concur(arr1, si, mid, ei);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr1 = { 0, 9, 1, 8, 2, 7, 3, 6, 4, 5, 10 };
		divide(arr1, 0, arr1.length - 1);
		int key = sc.nextInt();
		sc.close();
		for (int i : arr1) {
			System.out.print(arr1[i] + " ");
		}
		search(arr1, key);
	}
}
