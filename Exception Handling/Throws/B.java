package com.Throws;

public class B {
	public void m2() {
		A a = new A();
		try {
			a.m1();
		} catch (Exception e) {
			System.out.println("This is not allowed in java");
		}
	}
}