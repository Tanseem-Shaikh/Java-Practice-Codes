package mypackage;

import java.util.Scanner;

public class PalindromString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String: ");
		String str = sc.nextLine();

		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed = reversed + str.charAt(i);
		}
		if (str.equals(reversed)) {
			System.out.println("String is Palindrom");
		} else {
			System.out.println("String is not Palindrom");
		}
		sc.close();
	}
}
