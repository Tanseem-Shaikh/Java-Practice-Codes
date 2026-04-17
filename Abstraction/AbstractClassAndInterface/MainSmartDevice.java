package com.AbstractClassAndInterface;

public class MainSmartDevice {
	public static void main(String[] args) {
		Home h = new Home();
		h.control(new Fan());
		h.control(new Light());
		h.control(new Ac());
	}
}
