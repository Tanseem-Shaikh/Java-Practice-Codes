package com.AbstractClassAndInterface;

public abstract class BankAccount {
	double balance = 10000;

	public abstract void calculateInterest();

	void displayBalance() {
		System.out.println("Balance: " + balance);
	}
}
