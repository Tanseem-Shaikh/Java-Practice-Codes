package throughInterface;

public class SMSNotification implements Notification {

	@Override
	public void sendMessage(String msg) {
		System.out.println("Whtasapp  message sent :" + msg);

	}

}
