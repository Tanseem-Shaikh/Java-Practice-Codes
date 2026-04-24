package com.mypackage;

public class Student extends Main {
	static String clgName = "JSPM";

	static {
		System.out.println("This is static block");
	}
	{
		System.out.println("This is non-static block");
	}

	public Student() {
		System.out.println("This is no arg constructor");
	}

	public static void m1() {
		System.out.println("This is m1 method");
	}
}
