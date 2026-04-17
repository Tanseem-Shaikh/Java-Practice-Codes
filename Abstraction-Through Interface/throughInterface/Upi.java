package throughInterface;

public class Upi implements Payment{

	@Override
	public void pay(double amount) {
		System.out.println("Payment of rupees " + amount + " done using UPI");
		
	}

}
