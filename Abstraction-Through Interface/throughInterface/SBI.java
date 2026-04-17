package throughInterface;

public class SBI implements Bank {
	double balance = 1000;

	@Override
	public void deposit() {
		balance += 500;
		System.out.println("SBI Deposit: 500");

	}

	@Override
	public void withdrow() {
		balance -= 300;
		System.out.println("SBI Withdrow: 300");

	}

	@Override
	public void checkBalance() {
		System.out.println("SBI Balance:" + balance);

	}

}
