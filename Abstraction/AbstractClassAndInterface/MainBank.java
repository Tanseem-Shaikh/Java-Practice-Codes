package com.AbstractClassAndInterface;

public class MainBank {
	public static void main(String[] args) {
		SavingAccount s = new SavingAccount();
		s.calculateInterest();
		s.displayBalance();

		CurrentAccount c = new CurrentAccount();
		c.calculateInterest();
		c.displayBalance();
	}
}
