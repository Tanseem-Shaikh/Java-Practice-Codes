package throughInterface;

public class AC implements RemoteControl {

	@Override
	public void powerOn() {
		System.out.println("AC On");

	}

	@Override
	public void powerOff() {
		System.out.println("AC Off");

	}

}
