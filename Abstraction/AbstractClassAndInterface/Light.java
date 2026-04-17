package com.AbstractClassAndInterface;

public class Light implements SmartDevice {

	@Override
	public void turnOn() {
		System.out.println("Light on");

	}

	@Override
	public void turnOff() {
		System.out.println("Light off");

	}

}
