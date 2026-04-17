package com.AbstractClassAndInterface;

public class SavingAccount extends BankAccount {

	@Override
	public void calculateInterest() {
		double interest = balance * 0.05;
		System.out.println("saving Interest:" + interest);

	}

}
