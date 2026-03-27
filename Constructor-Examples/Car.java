package mypackage;

public class Car {
	String Model;
	String name;
	String color;
	int price;

	public Car(String Model, String name, String color, int price) {
		this.Model = Model;
		this.name = name;
		this.color = color;
		this.price = price;
	}

	public void display() {
		System.out.println("Car Information");
		System.out.println("Car Model : " + Model);
		System.out.println("Car name : " + name);
		System.out.println("car Color :" + color);
		System.out.println("Price :" + price);

	}
}
