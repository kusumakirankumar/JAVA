package programs;

public class VarArgsMethod {
	static void display(int... a) {
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		display(5);
		display(10, 15);
		display(20, 25, 30);
		display(35, 40, 45, 50);
	}
}
