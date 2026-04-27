package com.Interfacess;

public interface Demo {
	public static final int a = 18;

	public abstract void m1();

	public static void m2() {
		System.out.println("this is static method of demo Interface....");
	}

	default void m3() {
		System.out.println("this is default method of demo Interface....");
	}

	public static void main(String[] args) {
		System.out.println(Demo.a);
		Demo.m2();
		D d = new D();
		d.m1();
		d.m3();

	}
}
