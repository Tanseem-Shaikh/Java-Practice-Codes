package com.jdk;

final class Student { // make class as final we cannot inherit this class
	final int age = 21; // make variable as final we cannot modify it's value

	public Student() {
		System.out.println("This is constuctor");
	}

	public final void display() { // make method as final we cannot override this method
		System.out.println("This is method ");
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.display();

	}
}
