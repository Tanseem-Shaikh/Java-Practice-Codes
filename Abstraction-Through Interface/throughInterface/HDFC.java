package throughInterface;

public class HDFC implements Bank {

	double balance = 2000;

	@Override
	public void deposit() {
		balance += 700;
		System.out.println("HDFC Deposit: 700");

	}

	@Override
	public void withdrow() {
		balance -= 500;
		System.out.println("HDFC Withdrow: 500");

	}

	@Override
	public void checkBalance() {
		System.out.println("HDFC Balance:" + balance);

	}

}
