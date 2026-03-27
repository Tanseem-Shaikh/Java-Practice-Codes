package mypackage;

public class LibMain {
	public static void main(String[] args) {
		Library l1 = new Library("City Library", "Pune", "Java Basics", "James Gosling", 500);
		Library l2 = new Library("Knowledge Library", "Mumbai", "C", "Dennis Ritchie", 100);
		l1.display();
		System.out.print("\n");
		l2.display();
	}

}
