package programs;

import java.util.Scanner;

public class PrintingTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		sc.close();
		for (int i = 0; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}
}
