package mypackage;

public class IfElseProblems {
public static void main(String[] args) {
	//check if number is divisible by 5
//	int number=25;
//	if(number%5==0) {
//		System.out.println("number is Divisible by 5");
//	}else {
//		System.out.println("number is not  Divisible by 5");
//	}
//}
//}
	
	//check if number is greater than 100
//	int number=1000;
//	if(number>100) {
//		System.out.println(number+" number is grater than 100");
//	}else if(number<100) {
//		System.out.println(number+" number is smaller than 100");
//	}else {
//		System.out.println(number+" number is equal to 100");
//	}
//}
//}
	
	//check if the character is uppercase
//	char ch = 'A';
//	if(ch>='A' && ch<='Z') {
//		System.out.println(ch+" Character is Uppercase");
//	}else {
//		System.out.println(ch+" Character is lowercase");
//	}
//}
//}
	
//	//check whether the character is vowel or consonant
//	char ch = 'A';
//	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
//		System.out.println(ch+" Vowel");
//	}else {
//		System.out.println(ch+" Consonant");
//	}
//}
//}

	//Display grade based on marks
//int marks=100;
//if(marks>=75) {
//	System.out.println("Distinction");
//}else if(marks>=60) {
//	System.out.println("First class");
//}else if(marks>=50) {
//	System.out.println("second class");
//}else if(marks>=35) {
//	System.out.println("Pass");
//}else {
//	System.out.println("Fail");
//}
//}
//}
	//check whether chracter,vowel,constant,digit or special chracter
//	char ch='a';
//	if((ch>='A' && ch<='Z')|| (ch>='a' && ch<='z')) {
//	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
//		System.out.println(" Vowel");
//	}else {
//		System.out.println(" Consonant");
//	}
//	}else if(ch>='0'  && ch<='9') {
//		System.out.println("Digit");
//	}
//	else {
//		System.out.println("Special Character");
//	}
//	}
//	}
	 //display day name based on day number(1-7)
//	int day=2;
//	if(day==1) {
//		System.out.println("Monday");
//	}else if(day==2) {
//		System.out.println("Tuesday");
//	}else if(day==3) {
//		System.out.println("Wednesday");
//	}else if(day==4) {
//		System.out.println("Thursday");
//	}else if(day==5) {
//		System.out.println("Friday");
//	}else if(day==6) {
//		System.out.println("Saturday");
//	}else if(day==7) {
//		System.out.println("Sunday");
//	}else {
//		System.out.println("Invalid Day Number....! Enter In Number (1-7)");
//	}
//	}
//}
	
	//calculate Electricity bill based on units
	
//	int units=2000;
//	int bill;
//	if(units<=100) {
//		bill=units*5;
//		System.out.println(bill);
//	}else if(units<=200) {
//		bill=(100*5)+((units-100)*7);
//		System.out.println(bill);
//	}else {
//		bill=(100*5)+(100*7)+((units-200)*10);
//		System.out.println(bill);
//	}
//	}
//	}
	
	//Whether person is eligible for loan
//	int age=21;
//	double salary=20000;
//	if(age>=21) {
//		if(salary>=25000) {
//			System.out.println("Eligible for Loan");
//		}
//	else {
//		System.out.println("you are not eligible(Salary less than 25k)");
//	}
//}else {
//	System.out.println("you are not eligible(Age less than 21)");
//}
//}
//}
	
	//check login authentication
//	String username="Tanseem";
//	String pass="tanu@31";
//	if(username=="Tanseem") {
//		if(pass=="tanu@31") {
//			System.out.println("Login Successfully");
//		}else {
//			System.out.println("Password is incorrect");
//		}
//	}
//	else {
//		System.out.println("Username is invalid");
//	}
//		}
//	}
//	
	
	//check whether number is divisible by 3 and 5
//	int number=33;
//	if(number%3==0 && number%5==0) {
//		System.out.println("number is divisible by 3 and 5");
//	}else {
//		System.out.println("number is not divisible by 3 and 5");
//	}
//}
//}
	
	//check whether year is leap year
	int year=2026;
	if(year%4==0 && year%100!=0 || year%400==0) {
		System.out.println("Year is Leap Year");
		}else {
		System.out.println("Year is not Leap Year");
	}
}
}
