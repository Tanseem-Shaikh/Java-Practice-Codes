package ScannerClass;

//Take two numbers and print multiplication & division.
import java.util.Scanner;

public class MathematicalOperation {
	public class Addition {
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter first number:");
			int num1 = sc.nextInt();

			System.out.println("Enter second number:");
			int num2 = sc.nextInt();

			int mul = num1 * num2;
			int div = num1 / num2;
			System.out.println("Multiplication = " + mul);
			System.out.println("Division = " + div);
			sc.close();
		}
	}

}
