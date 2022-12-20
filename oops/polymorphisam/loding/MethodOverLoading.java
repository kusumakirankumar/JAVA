package oops.polymorphisam.loding;

public class MethodOverLoading {
	public static void main(String[] args) {
		ClassA classA = new ClassA();
		classA.addition();
		classA.addition(10);
		classA.addition(10, 20);
		classA.addition(10.00f, 30.20f);
		classA.addition(10, 20, 30);
	}
}
