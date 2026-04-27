package com.RunnableInterface;

public class MainClass {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		Thread t = new Thread(thread);
		t.start();
		thread.m1();
		thread.m2();
		thread.m3();
	}
}
