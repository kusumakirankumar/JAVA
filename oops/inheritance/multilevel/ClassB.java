package oops.inheritance.multilevel;

public class ClassB extends ClassA {
	int a;
	int b;
	int c;

	ClassB(int a, int b, int c) {
		super(a, b);
		this.c = c;
	}

	public void displayB() {
		System.out.println(c);
	}
}
