package ScannerClass;

//Take two strings using nextLine() and print their concatenation.

import java.util.Scanner;

public class StringConcat {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String: ");
		String str1 = sc.nextLine();

		System.out.println("Enter Second String: ");
		String str2 = sc.nextLine();

		String newString = str1.concat(str2);
		System.out.println("After Concatnation: " + newString);

	}
}