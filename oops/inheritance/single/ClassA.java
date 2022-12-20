package oops.inheritance.single;

public class ClassA {
	int a;
	int b;

	ClassA(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void displayA() {
		System.out.println(a + "\n" + b);
	}
}
