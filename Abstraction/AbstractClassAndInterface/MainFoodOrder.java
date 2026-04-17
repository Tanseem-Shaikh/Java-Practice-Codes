package com.AbstractClassAndInterface;

public class MainFoodOrder {
	public static void main(String[] args) {
		VegOrder vo = new VegOrder();
		vo.orderDetails();
		vo.prepareFood();

		NonVegOrder no = new NonVegOrder();
		no.orderDetails();
		no.prepareFood();
	}
}
