package operators;

import java.util.Scanner;

public class LargestNumberOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the number3: ");
        int num3 = sc.nextInt();
        System.out.print("Enter the number4: ");
        int num4 = sc.nextInt();
        int ans = num1 > num2 ? (num1 > num3 ? (num1 > num4 ? num1 : num4) : (num3)) : (num2 > num3 ? (num2 > num4 ? num2 : num4) : (num3 > num4 ? num3 : num4));
        System.out.println("Largest number is: "+ans);
    }
}
