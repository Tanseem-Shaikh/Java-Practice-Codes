package ScannerClass;

import java.util.Scanner;

public class MainEmployee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		String name = sc.nextLine();

		System.out.println("Enter Eployee Id: ");
		int emp_id = sc.nextInt();

		System.out.println("Enter Salary: ");
		double salary = sc.nextDouble();

		// creating object using constructor
		Employee emp = new Employee(name, emp_id, salary);

		// printing object (call toString Automatically)

		System.out.println(emp);
		sc.close();
	}
}
