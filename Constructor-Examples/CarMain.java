package mypackage;

public class CarMain {
	public static void main(String[] args) {
		Car c1 = new Car("BMW", "X5", "Black", 9500000);
		Car c2 = new Car("Toyota", "Fortuner", "Black", 3500000);
		Car c3 = new Car("Hyundai", "Creta", "White", 1500000);
		c1.display();
		System.out.println();
		c2.display();
		System.out.println();
		c3.display();
	}
}
