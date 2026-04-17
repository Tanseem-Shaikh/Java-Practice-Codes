package com.AbstractClassAndInterface;

public class Student extends Person implements Attendable {

	@Override
	public void markAttendance() {
		System.out.println("Student Attendance Marked");

	}

	@Override
	void getDetails() {
		System.out.println("Student Details");

	}

}
