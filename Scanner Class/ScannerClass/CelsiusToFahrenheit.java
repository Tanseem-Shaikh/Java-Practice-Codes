package ScannerClass;
//Take temperature in Celsius and convert to Fahrenheit.

import java.util.Scanner;

public class CelsiusToFahrenheit {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter temprature in Celsius :");
		double celsius = sc.nextDouble();

		double fahrenheit = (9.0 / 5) * celsius + 32;

		System.out.println("Temprature in Fahrenheit: " + fahrenheit);
		sc.close();
	}
}
