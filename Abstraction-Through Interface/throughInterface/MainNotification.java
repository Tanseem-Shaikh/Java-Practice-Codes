package throughInterface;

public class MainNotification {
	public static void main(String[] args) {
		Notification n;

		n = new EmailNotification();
		n.sendMessage("Hello From Email");
		System.out.println();

		n = new SMSNotification();
		n.sendMessage("Hello From SMS");
		System.out.println();

		n = new WhatsAppNotification();
		n.sendMessage("Hello From Whatsapp");

	}
}
