package com.AbstractClassAndInterface;


public class MainNotification {
	public static void main(String[] args) {
		Notification n;

		n = new SMSNotification();
		n.sendMessage("Hello from SMS");

		n = new EmailNotification();
		n.sendMessage("Hello from Email");

		n = new WhatsAppNotification();
		n.sendMessage("HEllo from WhatsApp");
	}
}
