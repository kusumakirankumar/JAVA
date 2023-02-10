package arrays;

public class ProductOfArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int ans = 1;
		for (int i = 0; i < arr.length; i++) {
			ans = arr[i] * ans;
		}
		System.out.println(ans);
	}
}
