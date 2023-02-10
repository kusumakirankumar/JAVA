package arrays;

public class PrimesPresentInArray {
	public static void isPrime(int a) {
		boolean b = true;
		if (a <= 1) {
			return;
		} else {
			for (int i = 2; i <= a / 2; i++) {
				if (a % i == 0) {
					b = false;
					break;
				}
			}
		}
		if (b == true) {
			System.out.println(a + " is Prime");
		} else {
			System.out.println(a + " is Not Prime");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, };
		for (int i = 0; i < arr.length; i++) {
			isPrime(arr[i]);
		}
	}
}
