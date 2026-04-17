package com.AbstractClassAndInterface;

public class Triangle extends Shape {

	@Override
	void area() {
		int b = 4, h = 5;
		System.out.println("Triangle Area:" + (0.5 * h * b));

	}

}
