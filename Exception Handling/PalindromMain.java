package com.mypackage;

public class PalindromMain {
	public static void main(String[] args) {
		try {
			Palindrom p = new Palindrom();
			p.checkPalindrom("madam");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
