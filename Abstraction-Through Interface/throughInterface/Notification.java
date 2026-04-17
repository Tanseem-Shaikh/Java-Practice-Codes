package throughInterface;

/*Notification System
Create interface Notification:
sendMessage(String msg)
Implement:
EmailNotification
SMSNotification
WhatsAppNotification*/

public interface Notification {
	void sendMessage(String msg);
}
