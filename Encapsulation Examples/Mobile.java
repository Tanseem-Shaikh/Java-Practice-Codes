package mypackage;

public class Mobile {
	private String username;
	private String password;
	public String getUserName() {
		return username;
	}
 public void setUserName(String userName) {
	this.username=userName;
}
public String getPassword() {
	return password;
}
 public void setPassword(String password) {
	if(password.length()>=8) {
this.password=password;
	System.out.println("Valid user.....!");
}else {
	System.out.println("Enter Password greater than 8 char");
}
}
}