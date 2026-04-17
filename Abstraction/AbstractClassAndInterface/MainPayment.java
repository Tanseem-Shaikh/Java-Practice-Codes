package com.AbstractClassAndInterface;

public class MainPayment {
	public static void main(String[] args) {
		Payment p;

		p = new CreditCardPayment();
		p.pay(1000);

		p = new UPIPayment();
		p.pay(2000);

		p = new NetBanking();
		p.pay(3000);
	}
}
