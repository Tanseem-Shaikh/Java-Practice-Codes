package com.AbstractClassAndInterface;

public class Fan implements SmartDevice {

	@Override
	public void turnOn() {
		System.out.println("Fan on");

	}

	@Override
	public void turnOff() {
		System.out.println("fan off");

	}

}
