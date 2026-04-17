package throughInterface;

public class FacebookAuth implements Authentication {

	@Override
	public void login() {
		System.out.println("Login Successfull using Facebook Account");

	}

	@Override
	public void logout() {
		System.out.println("Logout from Fecebook Account");

	}

}
