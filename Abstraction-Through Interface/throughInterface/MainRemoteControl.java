package throughInterface;

public class MainRemoteControl {
	public static void main(String[] args) {
		RemoteControl r;
		r = new TV();
		r.powerOn();
		r.powerOff();
		System.out.println("");
		r = new AC();
		r.powerOn();
		r.powerOff();
	}
}
