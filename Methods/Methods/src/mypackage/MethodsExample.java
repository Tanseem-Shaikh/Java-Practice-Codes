package mypackage;

public class MethodsExample {
//	//Parameterized without return type
//	public void add(int num1,int num2) {
//		int sum=num1+num2;
//		System.out.println("Addition of two numbers ="+sum);
//	}
//}
	// Parameterized with return type
//	public int add(int num1, int num2) {
//		return num1 + num2;
//	}
//}

//	//Non-Parameterized with return type
//	public int add() {
//		int num1=20;
//		int num2=5;
//		return num1+num2;
//	}
//	}
	// Non-Parameterized without return type
//		public void add() {
//			int num1=20;
//			int num2=5;
//			int sum= num1+num2;
//			System.out.println(sum);
//		}
//		}

	// 2.Even Odd Numbers
	// Parameterized without return type
//	public void EvenOddcheck(int num) {
//		System.out.println("Even Numbers");
//		for (int i = 1; i <= num; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}
//		System.out.println("Odd Numbers");
//		for (int i = 1; i <= num; i++) {
//			if (i % 2 != 0) {
//				System.out.println(i);
//			}
//		}
//	}
//}

	// Parameterized with return type
//	public String EvenOddcheck(int num) {
//		String result="Even Numbers:\n";
//		for (int i = 1; i <= num; i++) {
//			if (i % 2 == 0) {
//				result +=i +" ";
//			}
//		}
//		result+="\nOdd Numbers:\n";
//		for (int i = 1; i <= num; i++) {
//			if (i % 2 != 0) {
//				result +=i +" ";
//			}
//		}return result;
//	}
//}

	// Non-Parameterized without return type
//	int num=20;
//		public void EvenOddcheck() {
//			System.out.println("Even Numbers");
//			for (int i = 1; i <= num; i++) {
//				if (i % 2 == 0) {
//					System.out.println(i);
//				}
//			}
//			System.out.println("Odd Numbers");
//			for (int i = 1; i <= num; i++) {
//				if (i % 2 != 0) {
//					System.out.println(i);
//				}
//			}
//		}
//	}
	// Non-Parameterized with return type
//		int num=20;
//			public String EvenOddcheck() {
//				 String result="Even Numbers\n";
//				for (int i = 1; i <= num; i++) {
//					if (i % 2 == 0) {
//						result +=i +" ";
//					}
//				}
//				result+="\nOdd Numbers\n";
//				for (int i = 1; i <= num; i++) {
//					if (i % 2 != 0) {
//						result +=i +" ";
//					}
//				}return result;
//			}
//		}

	// 3.Factorial Numbers
	// Parameterized without return type
//		public void Factorial(int num) {
//			int fact=1;
//		for (int i = 1; i <= num; i++) {
//        fact=i*fact;
//        }  System.out.println(fact);
//		}
//}

	// Parameterized with return type
//		public int Factorial(int num) {
//			int fact = 1;
//			for (int i = 1; i <= num; i++) {
//				fact = fact * i;
//			}
//			return fact;
//		}
//	}

	// Non-Parameterized without return type
//		public void Factorial() {
//			int fact = 1;
//			int num = 5;
//			for (int i = 1; i <= num; i++) {
//				fact = fact * i;
//			}
//			System.out.println(fact);
//		}
//	}
	// Non-Parameterized with return type
//	int fact = 1;
//	int num = 5;
//
//	public int Factorial() {
//		for (int i = 1; i <= num; i++) {
//			fact = fact * i;
//		}
//		return fact;
//	}
//}

	// 4.Prime Numbers
	// Parameterized without return type
//		public void PrimeNumber(int num) {
//			int count=0;
//		for (int i = 1; i <= num; i++) {
//	if(num%i==0) {
//		count++;
//	}
//}if(count==2) {
//	System.out.println("Prime Number");
//}else {
//	System.out.println("Not Prime");
//}
//}
//}
	// Parameterized with return type
//	public String PrimeNumber(int num) {
//		int count=0;
//	for (int i = 1; i <= num; i++) {
//if(num%i==0) {
//	count++;
//}
//}if(count==2) {
//return "prime Number";
//}else {
//	return "not prime";
//}
//}
//}

	// Non-Parameterized without return type
//	int num=5;
//			public void PrimeNumber() {
//	int count=0;
//for (int i = 1; i <= num; i++) {
//if(num%i==0) {
//count++;
//}
//}if(count==2) {
//	System.out.println("Prime Number");
//	}else {
//		System.out.println("Not Prime");
//}
//}
//}
	// Non-Parameterized with return type
//int num=5;
//public String PrimeNumber() {
//int count=0;
//for (int i = 1; i <= num; i++) {
//if(num%i==0) {
//count++;
//}
//}if(count==2) {
//		return "prime Number";
//		}else {
//			return "not prime";
//		}
//}
//}
	// 5.Largest of numbers
//	// Parameterized without return type
//	public void FindMax(int a,int b) {
//		if(a>b) {
//			System.out.println(a+"is Greater");
//		}else {
//			System.out.println(b+"is greater");
//		}
//		}
//	}
//	
	// Parameterized with return type
//		public String FindMax(int a,int b) {
//			if(a>b) {
//				return "a is Greater";
//			}else {
//				return "bis greater";
//			}
//			}
//		}
//		
	// Non-Parameterized without return type
//	int a=20, b=15;
//		public void FindMax() {
//			if(a>b) {
//				System.out.println(a+"is Greater");
//			}else {
//				System.out.println(b+"is greater");
//			}
//			}
//		}
	// Non-Parameterized with return type
	int a = 20, b = 15;

	public String FindMax() {
		if (a > b) {
			return "a is Greater";
		} else {
			return "b is greater";
		}
	}
}