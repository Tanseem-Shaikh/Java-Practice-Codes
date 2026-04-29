package com.AbstractClassAndInterface;

public class Ac implements SmartDevice {

	@Override
	public void turnOn() {
		System.out.println("Ac on");

	}

	@Override
	public void turnOff() {
		System.out.println("Ac off");

	}

}
