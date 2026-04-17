package com.AbstractClassAndInterface;

public class Clothing extends Product implements Discount {
	@Override
	void getPrice() {
		System.out.println("Clothing Price: 5000");

	}

	@Override
	public void applyDiscount() {
		System.out.println("Clothing Discount : 50%");

	}
}
