package ScannerClass;
//Take a character from user and check whether it is vowel or consonant.

import java.util.Scanner;

public class VowelConsonant {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr Character To check: ");
		char ch = sc.next().charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println("It is Vowel");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("It is Consonant");
		} else {
			System.out.println("Ivalid input");

		}
	}
}
