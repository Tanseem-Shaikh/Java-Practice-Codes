package mypackage;

import java.util.Scanner;

public class StringBuilder_Code {
	public static void main(String[] args) {
//		String str = "Hello";
//		StringBuilder sb = new StringBuilder(str);
//		sb.append("Java");
//		System.out.println(sb);
//		sb.replace(5, 9, "Python");
//		System.out.println(sb);
//		sb.delete(2, 5);
//		System.out.println(sb);
//		sb.reverse();
//		System.out.println(sb);
//
//		// count of string without using length()
//
//		int count = 0;
//		for (int i = 0;; i++) {
//			try {
//				sb.charAt(i);
//				count++;
//			} catch (Exception e) {
//				break;
//			}
//		}
//		System.out.println("Characters:" + count);
//
//		String str1 = "There are many lang but is most Popular";
//		StringBuilder sb1 = new StringBuilder(str1);
//		sb1.insert(24, "Java ");
//		System.out.println(sb1);

		// Palindrom using string buffer

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder(str);
		String reversed = sb.reverse().toString();
		if (str.equals(reversed)) {
			System.out.println("Palindrom");
		} else {
			System.out.println("Not Palindrom");
		}

	}
}
