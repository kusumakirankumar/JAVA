package programs;

public class SumOfNumbersInString {
	public static void main(String[] args) {
		String str = "10kiran123";
		char[] ch1 = str.toCharArray();
		int num = 0;
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (ch1[i] >= '0' && ch1[i] <= '9') {
				num = num * 10 + (ch1[i] - '0');
			} else {
				sum += num;
				num = 0;
			}
		}
		System.out.print((sum + num) + " ");
	}
}
