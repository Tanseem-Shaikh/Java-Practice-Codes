package com.RunnableInterface;

public class MyThread implements Runnable, A, B, C {

	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
			System.out.println("value of I -->" + i);
		}

	}

	@Override
	public void m1() {
		for (int i = 111; i <= 300; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
			System.out.println("value of I -->" + i);
		}

	}

	@Override
	public void m2() {

		for (int i = 211; i <= 300; i++) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
			}
			System.out.println("value of I -->" + i);
		}
	}

	@Override
	public void m3() {
		for (int i = 311; i <= 4100; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
			System.out.println("value of I -->" + i);
		}

	}

}
