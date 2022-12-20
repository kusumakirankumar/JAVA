package oops.encapsulation;

public class Encapsulation {
	public static void main(String[] args) {
		ClassA classA = new ClassA();
		classA.setAge(24);
		if (classA.getAge() > 18) {
			System.out.println("you are eligible for vote because you are above " + classA.getAge());
		} else {
			System.out.println("you are not eligible for vote because you are below " + classA.getAge());
		}
	}
}
