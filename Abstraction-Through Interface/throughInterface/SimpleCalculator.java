package throughInterface;

public class SimpleCalculator implements Calculator{

	@Override
	public void add() {
		System.out.println("this is add method");
		
	}

	@Override
	public void sustract() {
		System.out.println("this is substract method");
		
	}

	@Override
	public void multiply() {
		System.out.println("this is multiply method");
		
	}

	@Override
	public void divide() {
		System.out.println("this is divide method");
		
	}

}
