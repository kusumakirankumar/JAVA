package oops.abstraction;

public class ClassB extends ClassA {
	void getData(int a, int b, int c) {
		super.getData(a, b, c);
	}

	@Override
	void sum() {
		System.out.println(a + b + c);

	}

}
