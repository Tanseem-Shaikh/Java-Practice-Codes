package ScannerClass;

import java.util.Scanner;

// Take principal, rate, time and calculate Simple Interest (SI = PRT/100)

public class SimpleInterest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr Principl: ");
		double p = sc.nextDouble();

		System.out.println("Enter Rate: ");
		double r = sc.nextDouble();

		System.out.println("Enter Time: ");
		double t = sc.nextDouble();

		// calculate simple interest
		double si = (p * r * t) / 100;
		System.out.println("Simple Interest = " + si);
		sc.close();
	}
}