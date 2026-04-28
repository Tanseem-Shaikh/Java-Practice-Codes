package com.serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {

	// Deserialization process

	public static void main(String[] args) throws Exception {

		FileInputStream file = new FileInputStream("D:\\New folder\\Employee1.txt");
		ObjectInputStream os = new ObjectInputStream(file);

		Employee emp = (Employee) os.readObject();

		System.out.println(emp.id + " " + emp.name + " " + emp.salary + " ");

		os.close();
		file.close();
	}

}
