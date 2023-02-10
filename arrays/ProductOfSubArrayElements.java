package arrays;

public class ProductOfSubArrayElements {
	public static void sortedElements(int[] arr) {
		int elements = 3;
		int ans = 1;
		for (int i = 0; i < elements; i++) {
			ans = ans * arr[i];
		}
		System.out.println(ans);
	}
	public static void unSortedElements(int[] arr) {
		int ans = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			ans = arr[i] * ans;
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6,7,8,9};
		int[] arr2 = {9,1,5,2,4,3,8,6,7};
		sortedElements(arr1);
		unSortedElements(arr2);
	}
}
