package mypackage;

public class Calculator {
public void add(int a,int b) {
	System.out.println(a+b);
}
public void add(int a, int b, int c) {
	System.out.println(a+b+c);
}
public void multiply(int x,int y) {
	System.out.println(x*y);
}
public double multiply(double x,double y) {
	return x*y;
}
public void sum(int n1, int n2) {
	System.out.println(n1+n2);
}
public float sum(float n1,float n2) {
	return n1+n2;
}
public void show(int num,String str) {
	System.out.println(num +" "+str);
}
public void show(String str,int num) {
	System.out.println(str +" "+num);
}
public String login(String username) {
	return username;
}
public void login(String username,String password) {
	System.out.println(username);
	System.out.println(password);
}
}