package com.AbstractClassAndInterface;

public class NetBanking implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Paid using Net Banking:" + amount);

	}

}
