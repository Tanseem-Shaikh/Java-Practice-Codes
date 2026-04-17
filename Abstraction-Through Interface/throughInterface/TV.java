package throughInterface;

public class TV implements RemoteControl {

	@Override
	public void powerOn() {
		System.out.println("TV On");

	}

	@Override
	public void powerOff() {
		System.out.println("TV Off");

	}

}
