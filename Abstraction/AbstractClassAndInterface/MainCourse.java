package com.AbstractClassAndInterface;

public class MainCourse {
	public static void main(String[] args) {
		JavaCourse j = new JavaCourse();
		j.courseDetails();
		j.calculateDuration();

		PaythonCourse p = new PaythonCourse();
		p.courseDetails();
		p.calculateDuration();
	}
}
