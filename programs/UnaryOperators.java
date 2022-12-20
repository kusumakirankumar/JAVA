package programs;

public class UnaryOperators {
// Understanding of Unary Operators
	public static void main(String[] args) {

		int a = 5;
		int b = a++; // In this line the 'a' will be same because the value "10" is assigned first
						// then the value of 'a' is incremented
		System.out.println("First: " + b);

		int c = ++a; // In this line the 'a' will be incremented first and then the value "11" is
						// assigned to the variable 'c'
		System.out.println("Second: " + c);

		int d = 5;
		int e = d++ + ++d; // First "d++" will be '21' and then "++d" will be '21'
		System.out.println("Third: " + e);

		int f = 5;
		int g = f-- + --f; // First "f--" will be '19' and then "--f" will be '19'
		System.out.println("Forth: " + g);

		int h = 5;
		int i = h++ + h--; // First "h++" will be '31' and then "h--" will be '30'
		System.out.println("Fifth: " + i);
	}
}
