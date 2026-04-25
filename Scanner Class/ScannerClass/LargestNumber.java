package ScannerClass;
//Take three numbers and print the largest number.

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number:");
		int num1 = sc.nextInt();

		System.out.println("Enter second number:");
		int num2 = sc.nextInt();

		System.out.println("Enter Third number:");
		int num3 = sc.nextInt();

		if (num1 >= num2 && num1 >= num3) {
			System.out.println("Number " + num1 + " is grater");
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("Number " + num2 + " is grater");
		} else {
			System.out.println("Number " + num3 + " is grater");
		}
		sc.close();
	}
}
