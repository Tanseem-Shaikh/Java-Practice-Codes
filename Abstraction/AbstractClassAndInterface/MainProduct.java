package com.AbstractClassAndInterface;

public class MainProduct {
	public static void main(String[] args) {
		Electonics e = new Electonics();
		e.getPrice();
		e.applyDiscount();

		System.out.println();

		Clothing c = new Clothing();
		c.getPrice();
		c.applyDiscount();
	}
}
