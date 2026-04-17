package throughInterface;

public class MainPayment {
	public static void main(String[] args) {
		Payment p;

		p = new Upi();
		p.pay(1000);

		p = new DebitCard();
		p.pay(2000);

		p = new CreditCard();
		p.pay(3000);

	}
}
