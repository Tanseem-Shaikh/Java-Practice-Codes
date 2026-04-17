package throughInterface;

public class CreditCard implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Payment of rupees " + amount + " done using Credit card");

	}

}
