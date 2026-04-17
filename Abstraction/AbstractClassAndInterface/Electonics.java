package com.AbstractClassAndInterface;

public class Electonics extends Product implements Discount {

	@Override
	void getPrice() {
		System.out.println("Electronic Price: 2000");

	}

	@Override
	public void applyDiscount() {
		System.out.println("Electronic Discount : 10%");

	}

}
