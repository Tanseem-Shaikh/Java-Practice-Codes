package com.ThreadClass;

public class Main {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();  //it is use to start thread logic
		t.m1();
		t.m2();
	}
}
