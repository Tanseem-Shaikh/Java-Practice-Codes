package throughInterface;

public class Rectangle implements Shape {

	@Override
	public void area() {
		System.out.println("this is area method of rectangle");
		
	}

	@Override
	public void perimeter() {
		System.out.println("this is perimeter method rectangle");
		
	}

}
