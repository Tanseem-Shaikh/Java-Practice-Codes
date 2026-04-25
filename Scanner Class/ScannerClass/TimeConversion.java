package ScannerClass;
//Take time in seconds and convert into minutes and seconds.

import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Time in Seconds");
		int totalSeconds = sc.nextInt();

		// convert into minute and seconds

		int minutes = totalSeconds / 60;
		int seconds = totalSeconds % 60;

		System.out.println("Minutes: " + minutes);
		System.out.println("Seconds: " + seconds);
		sc.close();
	}

}
