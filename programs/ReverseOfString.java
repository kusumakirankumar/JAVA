package programs;

public class ReverseOfString {
	public static void main(String[] args) {
		String str1 = "KIRAN KUMAR"; // Initializing the string
		String str2 = " "; // Initializing the empty string
		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i); // Taking the string elements in order
			str2 = ch + str2; // Rearranging the string in reverse order
		}
		System.out.println(str2); // Printing the reversed string
	}
}
