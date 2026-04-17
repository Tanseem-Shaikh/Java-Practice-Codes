package com.AbstractClassAndInterface;

public class SMSNotification implements Notification {

	@Override
	public void sendMessage(String msg) {
		System.out.println("SMS Sent :" + msg);

	}

}
