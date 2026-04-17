package throughInterface;

public class DebitCard implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Payment of rupees " + amount + " done using Debit card");

	}

}
