package ScannerClass;

//Take marks of 5 subjects and print total & percentage

import java.util.Scanner;

public class MarksCalculation {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter marks of Subject 1: ");
		double sub1 = sc.nextDouble();

		System.out.println("Enter marks of Subject 2: ");
		double sub2 = sc.nextDouble();

		System.out.println("Enter marks of Subject 3: ");
		double sub3 = sc.nextDouble();

		System.out.println("Enter marks of Subject 4: ");
		double sub4 = sc.nextDouble();

		System.out.println("Enter marks of Subject 5: ");
		double sub5 = sc.nextDouble();

		double total = sub1 + sub2 + sub3 + sub4 + sub5;
		double percentage = total / 5;

		System.out.println("Total Marks: " + total);
		System.out.println("Percentage: " + percentage);
		sc.close();

	}
}