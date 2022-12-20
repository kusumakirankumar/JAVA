package programs;

public class EvenNumbersInGivenNumber {
	public static void main(String[] args) {
		int num = 123456789;
		char[] arr = ("" + num).toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
