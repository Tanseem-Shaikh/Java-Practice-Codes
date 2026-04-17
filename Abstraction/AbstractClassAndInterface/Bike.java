package com.AbstractClassAndInterface;

public class Bike implements Vehicle {

	@Override
	public void start() {
		System.out.println("Bike start with key");

	}

	@Override
	public void stop() {
		System.out.println("Bike stop with brake");

	}

}
