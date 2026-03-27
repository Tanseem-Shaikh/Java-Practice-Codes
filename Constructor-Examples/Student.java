package mypackage;

//class with name student and display info using constructor 
public class Student {
	String stu_name;
	String course;
	int roll_no;
	int marks;

	public Student(String stu_name, String course, int roll_no, int marks) {
		this.stu_name = stu_name;
		this.course = course;
		this.roll_no = roll_no;
		this.marks = marks;
	}

	public void display() {
		System.out.println("Student information");
		System.out.println("Name :" + stu_name);
		System.out.println("Course :" + course);
		System.out.println("Roll_No :" + roll_no);
		System.out.println("Marks :" + marks);
	}
}
