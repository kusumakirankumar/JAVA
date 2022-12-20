package arrays;

import java.util.HashSet;

public class FindingSubsetOfArray {
	static boolean isSubset(int[] arr1, int[] arr2, int m, int n) {
		HashSet<Integer> hash = new HashSet<>();
		for (int i = 0; i < m; i++) {
			if (!hash.contains(arr1[i])) {
				hash.add(arr1[i]);
			}
		}
		for (int i = 0; i < n; i++) {
			if (!hash.contains(arr2[i])) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 4, 2, 7, 3, 0 };
		int[] arr2 = { 1, 2, 4 };
		int m = arr1.length;
		int n = arr2.length;
		if (isSubset(arr1, arr2, m, n)) {
			System.out.print("arr2 is subset of arr1.");
		} else {
			System.out.print("arr2 is not subset of arr1.");
		}
	}
}
