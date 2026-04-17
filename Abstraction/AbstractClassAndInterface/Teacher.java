package com.AbstractClassAndInterface;

public class Teacher extends Person implements Attendable {

	@Override
	public void markAttendance() {
		System.out.println("Teacher Attendance Marked");

	}

	@Override
	void getDetails() {
		System.out.println("Teacher Details");

	}

}
