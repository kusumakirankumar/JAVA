package oops.inheritance.multilevel;

public class ClassC extends ClassB {
	int d;

	ClassC(int a, int b, int c, int d) {
		super(a, b, c);
		this.d = d;
	}

	public void displayC() {
		System.out.println(d);
	}
}
