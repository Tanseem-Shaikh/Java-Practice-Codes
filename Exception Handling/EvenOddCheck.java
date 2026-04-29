package com.mypackage;

public class EvenOddCheck {
	 public void checkNumber(int num) throws Exception {
			if (num%2!=0) {
				throw new Exception("Odd number");
			} else {
				System.out.println("Even number");
			}
		}
}
