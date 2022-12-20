package arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class RemovingDuplicatesInGivenArray {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9, 2, 4, 6, 8, 0, 9, 8, 7, 6, 5, 4, 3, 2, 1 }; // Initialized array
		ArrayList<Integer> nums1 = new ArrayList<>(); // ArrayList
		HashSet<Integer> nums2 = new HashSet<>(); // HashMap
		for (int i = 0; i < arr.length; i++) { // Loop for iterate through array
			if (!nums1.contains(arr[i])) { // Condition for checking elements
				nums1.add(arr[i]); // Adding elements to ArrayList
			}
			if (!nums2.contains(arr[i])) {
				nums2.add(arr[i]); // Adding elements to HashMap
			}
		}
		System.out.print(nums1 + " "); // Printing ArrayList output
		System.out.println();
		System.out.print(nums2 + " "); // Printing HashMap output
	}
}
