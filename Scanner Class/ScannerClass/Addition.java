package ScannerClass;

import java.util.Scanner;

//  Take two numbers from user and print their addition.
public class Addition {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number:");
		int num1 = sc.nextInt();

		System.out.println("Enter second number:");
		int num2 = sc.nextInt();

		int sum = num1 + num2;

		System.out.println("Addition = " + sum);
		sc.close();
	}
}
