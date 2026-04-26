package com.mypackage;

public class SwitchCaseExamples {
	public static void main(String[] args) {
		// Days Prints
//		int days = 5;
//		switch (days) {
//		case 1:
//			System.out.println("Monday");
//			break;
//		case 2:
//			System.out.println("Tuesday");
//			break;
//		case 3:
//			System.out.println("Wednesday");
//			break;
//		case 4:
//			System.out.println("Thursday");
//			break;
//		case 5:
//			System.out.println("Friday");
//			break;
//		case 6:
//			System.out.println("Saturday");
//			break;
//		case 7:
//			System.out.println("Sunday");
//			break;
//		default:
//			System.out.println("Invalid Day");
//		}
//	}
//}
// Months Prints
//		int months =10;
//		switch (months) {
//		case 1:
//			System.out.println("January");
//			break;
//		case 2:
//			System.out.println("Febuary");
//			break;
//		case 3:
//			System.out.println("March");
//			break;
//		case 4:
//			System.out.println("April");
//			break;
//		case 5:
//			System.out.println("May");
//			break;
//		case 6:
//			System.out.println("June");
//			break;
//		case 7:
//			System.out.println("July");
//			break;
//		case 8:
//			System.out.println("August");
//			break;
//		case 9:
//			System.out.println("September");
//			break;
//		case 10:
//			System.out.println("October");
//			break;
//		case 11:
//			System.out.println("November");
//			break;
//		case 12:
//			System.out.println("December");
//			break;
//		default:
//			System.out.println("Invalid Month");
//		}
//	}
//}

		// Accept Two numbers and operator and perform operation
//		int x=20;
//		int y=5;
//		char operator='/';
//		switch(operator) {
//		case '+':
//			System.out.println(x+y);
//		break;
//		case '-':
//			System.out.println(x-y);
//		break;
//		case '*':
//			System.out.println(x*y);
//		break;
//		case '/':
//			System.out.println(x/y);
//		break;
//		case '%':
//			System.out.println(x%y);
//		break;
//		default:
//			System.out.println("invalid Operator");
//		}
//	}
//}
//		take grade character [A,B,C,D,E] and print message
//		
//       Input color name and print appropriate action
//		String color = "Red";
//		switch (color) {
//		case "Red":
//			System.out.println("Stop !");
//			break;
//		case "Yellow":
//			System.out.println("Ready to Go !");
//			break;
//
//		case "Green":
//			System.out.println("Go !");
//			break;
//		default:
//			System.out.println("invalid color");
//		}
//	}
//}

		// take input as character and print it's vowel or consonant
//		char ch = 'h';
//		switch (ch) {
//		case 'a':
//		case 'e':
//		case 'i':
//		case 'o':
//		case 'u':
//		case 'A':
//		case 'E':
//		case 'I':
//		case 'O':
//		case 'U':
//			System.out.println("It is vowel");
//			break;
//		default:
//			System.out.println("consonant");
//		}
//	}
//}

		// print even or odd no take expression as(num%2)
//		int num = 2;
//		switch (num % 2) {
//		case 0:
//			System.out.println("Even number");
//			break;
//		case -1:
//			System.out.println("Even number");
//			break;
//
//		}
//	}
//}

		   //month number(1-12) and print corresponding season
//		

		//create menu Driven
//		int menu=8;
//		switch(menu) {
//		case 1:
//			System.out.println("Login");
//			break;
//		case 2:
//			System.out.println("Register");
//			break;
//		case 3:
//			System.out.println("Profile");
//			break;
//		case 4:
//			System.out.println("Logout");
//			break;
//		default:
//			System.out.println("Invalid Menu number");
//		}
//	}
//		}
//		print weekday(1-5) & weekend(6-7)
//		int day = 2;
//		switch (day) {
//		case 1:
//		case 2:
//		case 3:
//		case 4:
//		case 5:
//			System.out.println("Weekday");
//			break;
//		case 6:
//		case 7:
//			System.out.println("Weekend");
//		default:
//			System.out.println("Invalid Day");
//		}
//	}
//}
//		print area of circle,square,rectangle
		int choice=1;
		float r=5;
		float l=10,b=4;
		float side=6;
		double area;
		switch (choice) {
		case 1:
			 area = 3.14 *r *r;
			System.out.println("Area of Circle  = " +area);
			break;
		case 2:
			area = l * b;
			System.out.println("Area of Rectangle = " + area);
			break;
		case 3:
			area=side*side;
			System.out.println("Area of Square= " + area);
			break;
			default:
				System.out.println("Invalid Choice");
		}
	}
}
