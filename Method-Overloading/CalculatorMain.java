package mypackage;

public class CalculatorMain {
public static void main(String[] args) {
	Calculator c1=new Calculator();
	c1.add(2, 4);
	c1.add(3, 5, 2);
	c1.multiply(2, 2);
	System.out.println(c1.multiply(2.0, 10.5));
	c1.sum(5, 5);
	System.out.println(c1.sum(2.5f, 2.5f));
	c1.show(10, "Tanseem");
	c1.show("Asma", 2);
	c1.login("Asma","Asma@18");
	System.out.println(c1.login("Asma"));
	}
}
