package oops.polymorphisam.loding;

public class ClassA {
	int a, b;

	ClassA() {
		a = 20;
		b = 30;
	}

	void addition() {
		System.out.println(a + b);
	}

	void addition(int a) {
		System.out.println(a + a);
	}

	void addition(int a, int b) {
		System.out.println(a * b);
	}

	void addition(float a, float b) {
		System.out.println(a * b);
	}

	void addition(int a, int b, int c) {
		System.out.println(a + b + c);
	}
}
