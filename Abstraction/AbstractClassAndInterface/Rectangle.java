package com.AbstractClassAndInterface;

public class Rectangle extends Shape {

	@Override
	void area() {
		int l = 2, b = 4;
		System.out.println("Rectangle Area:" + (l * b));

	}

}
