package com.mypackage;

public class MainEvenOdd {
	public static void main(String[] args) {
		EvenOddCheck obj = new EvenOddCheck();
		try {
			obj.checkNumber(20);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
