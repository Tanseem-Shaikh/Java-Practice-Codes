package com.AbstractClassAndInterface;

public class EmailNotification implements Notification {

	@Override
	public void sendMessage(String msg) {
		System.out.println("Email Sent :" + msg);

	}

}
