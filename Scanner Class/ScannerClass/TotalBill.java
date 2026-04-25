package ScannerClass;
// Take the price and quantity of a product and print total bill.

import java.util.Scanner;

public class TotalBill {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Price of Product: ");
		double price = sc.nextDouble();

		System.out.println("Enter Quantity: ");
		int quantity = sc.nextInt();

		double total = price * quantity;
		System.out.println("Total Bill: " + total);
		sc.close();
	}
}