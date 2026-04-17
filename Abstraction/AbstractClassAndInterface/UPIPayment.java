package com.AbstractClassAndInterface;

public class UPIPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Paid using UPI:" + amount);

	}

}
