package programs;

public class ArithmeticOperations {
	public static void main(String[] args) {
		int a = 5, b = 2;
		int c = a + b; // Addition
		int d = a - b; // Subtraction
		int e = a * b; // Multiplication
		int f = a / b; // Division
		int g = a % b; // Modulus
		int h = a | b; // Bit wise OR operation
		int i = a & b; // Bit wise AND operation
		int k = a ^ b; // Bit wise XOR operation
		System.out.println("Addition: " + c);
		System.out.println("Subtraction: " + d);
		System.out.println("Multiplication: " + e);
		System.out.println("Division: " + f);
		System.out.println("Modulus: " + g);
		System.out.println("Bit wise OR is: " + h);
		System.out.println("Bit wise AND is: " + i);
		System.out.println("Bit wise XOR is: " + k);
	}
}
