package oops.abstraction;

public abstract class ClassA {
	int a, b, c;

	void getData(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	abstract void sum();
}
