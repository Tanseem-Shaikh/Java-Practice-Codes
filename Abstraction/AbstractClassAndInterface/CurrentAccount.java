package com.AbstractClassAndInterface;

public class CurrentAccount extends BankAccount {

	@Override
	public void calculateInterest() {
		double interest=balance*0.02;
		System.out.println("current Interest:" +interest);
	}

}
