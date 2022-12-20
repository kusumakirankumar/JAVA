package sorting;

public class StringSort {
	public static void main(String[] args) {
		String str = "kirankumar";
		String sortedarr = new String();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		for (int i = 0; i < ch.length; i++) {
			sortedarr = sortedarr + ch[i];
		}
		System.out.println(sortedarr);
	}
}
