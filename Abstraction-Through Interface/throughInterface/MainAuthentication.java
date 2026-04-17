package throughInterface;

public class MainAuthentication {
	public static void main(String[] args) {
		Authentication a;
		a = new GoogleAuth();
		a.login();
		a.logout();

		System.out.println();

		a = new FacebookAuth();
		a.login();
		a.logout();

	}
}
