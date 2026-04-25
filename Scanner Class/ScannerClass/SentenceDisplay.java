package ScannerClass;
//Take a sentence from user using nextLine() and print it
import java.util.Scanner;

public class SentenceDisplay {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentencce");
		String sentencce = sc.nextLine();

		System.out.println("Your  sentencce: " + sentencce);
		sc.close();

	}
}
