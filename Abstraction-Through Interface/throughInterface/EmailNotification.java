package throughInterface;

public class EmailNotification implements Notification {

	@Override
	public void sendMessage(String msg) {
		System.out.println("Email sent:" + msg);
		
	}

}
