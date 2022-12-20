package programs;

public class NumbersPresentInString {
	public static void main(String[] args) {
		String str = "k3ir26a1nkumar123";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				System.out.print(ch + " ");
			}
		}
	}
}
