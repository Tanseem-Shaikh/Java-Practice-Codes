package com.ThreadClass;

public class MyThread extends Thread {
	public void run() {
		for (int i = 0; i <= 100; i++) {
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
			}
			System.out.println(i);
		}
	}

	public synchronized void m1() {
		for (int i = 111; i <= 200; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
			System.out.println(i);
		}
	}

	public void m2() {
		for (int i = 111; i <= 200; i++) {
			System.out.println(i);
		}
	}
}