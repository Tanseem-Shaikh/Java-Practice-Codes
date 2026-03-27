package mypackage;

public class StudMain {
	public static void main(String[] args) {
		Student s1 = new Student("Tanseem", "Engineering", 40, 90);
		Student s2 = new Student("Asma", "BSC", 4, 80);
		Student s3 = new Student("Priya", "Engineering", 33, 60);
		s1.display();
		System.out.print("\n");
		s2.display();
		System.out.print("\n");
		s3.display();
	}
}
