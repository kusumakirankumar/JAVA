package arrays;

public class PalindromesPresentInArray {
	public static void isPalindrome(int a) {
		int ans = a;
		int sum = 0;
		if (a <= 0) {
			return;
		} else {
			while (a != 0) {
				int rem = a % 10;
				sum = sum * 10 + rem;
				a = a / 10;
			}
		}
		if (sum == ans) {
			System.out.println(ans + " is Palindrome");
		} else {
			System.out.println(ans + " is Not Palindrome");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 121, 242, 457, 954, 970, 977, 686 };
		for (int i = 0; i < arr.length; i++) {
			isPalindrome(arr[i]);
		}
	}
}
