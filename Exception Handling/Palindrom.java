package com.mypackage;

public class Palindrom {
	 public void checkPalindrom(String str) throws Exception {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (!str.equals(rev)) {
			throw new Exception("not a Palindrom");
		} else {
			System.out.println("It is Palindrom");
		}
	}
}
