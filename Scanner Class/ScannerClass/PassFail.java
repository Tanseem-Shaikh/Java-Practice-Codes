package ScannerClass;
//Take marks as float and check whether student is pass or fail.

import java.util.Scanner;

public class PassFail {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter marks: ");
		double marks = sc.nextDouble();
		if (marks > 40) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		sc.close();
	}
}
