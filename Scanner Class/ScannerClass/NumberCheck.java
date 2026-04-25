package ScannerClass;
// Take a number and check if it is positive, negative, or zero.

import java.util.Scanner;

public class NumberCheck {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int number = sc.nextInt();

		if (number > 0) {
			System.out.println("Number is Positive");
		} else if (number < 0) {
			System.out.println("Number is Negative");
		} else {
			System.out.println("Number is Zero");
		}
		sc.close();
	}
}
