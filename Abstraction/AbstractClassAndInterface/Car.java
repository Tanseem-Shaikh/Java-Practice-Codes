package com.AbstractClassAndInterface;

public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Car start with key");

	}

	@Override
	public void stop() {
		System.out.println("Car stop with brake");

	}

}
