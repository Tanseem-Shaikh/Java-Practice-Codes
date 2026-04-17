package throughInterface;

public class WhatsAppNotification implements Notification {

	@Override
	public void sendMessage(String msg) {
		System.out.println("Email sent:" +msg);
		
	}

}
