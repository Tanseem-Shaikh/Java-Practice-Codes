package throughInterface;

public class MainBank {
	public static void main(String[] args) {
		Bank b;
		b = new SBI();
		b.deposit();
		b.withdrow();
		b.checkBalance();

		System.out.println("\n");

		b = new HDFC();
		b.deposit();
		b.withdrow();
		b.checkBalance();
	}
}
