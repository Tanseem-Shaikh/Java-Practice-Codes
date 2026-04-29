package com.mypackage;

public class Exception_Handling {
	public static void main(String[] args) {

		// Unchecked Exception(RunTime Exception) ----> Arithmatic Exception
//		System.out.println(20 / 4);
//		System.out.println(8 / 2);
//
//		try { // here write an Exception
//
//			System.out.println(9 / 0);
//
//		} catch (ArithmeticException e) { // here define which type of exception
//
//			System.out.println("It is not possible divible by zero");
//
//		} finally { // Always Executable
//
//			System.out.println("This is finally Block");
//		}
//
//		System.out.println(9 / 3);
//		System.out.println(12 / 3);
//		System.out.println(42 / 7);

		// checked Exception(CompileTime Exception) ----> ClassNotFound Exception

		try {
			Class.forName("");
		} catch (ClassNotFoundException e) {
			System.out.println("This is an Example of Compile Time Ecception");
		}
	}
}
