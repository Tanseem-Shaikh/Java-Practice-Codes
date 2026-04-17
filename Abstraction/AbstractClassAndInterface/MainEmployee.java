package com.AbstractClassAndInterface;

public class MainEmployee {
	public static void main(String[] args) {
		Company c = new Company();
		c.showEmployee(new FullTimeEmployee());
		c.showEmployee(new PartTimeEmployee());
	}
}
