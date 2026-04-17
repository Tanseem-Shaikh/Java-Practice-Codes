package throughInterface;

public class MainShape {
	public static void main(String[] args) {
		
Shape s;
s=new Circle();
s.area();
s.perimeter();

s=new Rectangle();
s.area();
s.perimeter();
}
}
