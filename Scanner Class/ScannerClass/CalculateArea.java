package ScannerClass;
//Take radius from user and calculate area of circle.

import java.util.Scanner;

public class CalculateArea {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter radius:");
		double radius = sc.nextDouble();

		double area = 3.14 * radius * radius;

		System.out.println("Area of Circle = " + area);
		sc.close();
	}
}