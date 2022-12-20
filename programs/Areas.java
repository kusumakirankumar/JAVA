package programs;

import java.util.Scanner;

public class Areas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius: ");
		int radius = sc.nextInt();
		System.out.print("Enter Rectangle length: ");
		int length = sc.nextInt();
		System.out.print("Enter Rectangle width: ");
		int width = sc.nextInt();
		sc.close();
		double circle = 3.141 * radius * radius;
		int rectangle = length * width;
		System.out.println("Area of circle: " + circle);
		System.out.println("Area of rectangle: " + rectangle);
	}
}
