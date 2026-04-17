package com.AbstractClassAndInterface;

public class MainAttendable {
	public static void main(String[] args) {
		Student s = new Student();
		s.getDetails();
		s.markAttendance();

		Teacher t = new Teacher();
		t.getDetails();
		t.markAttendance();
	}
}
