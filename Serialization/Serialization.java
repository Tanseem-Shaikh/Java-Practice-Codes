package com.serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {

	// Serialization process

	public static void main(String[] args) throws Exception {

		Employee emp = new Employee(101, "Tanseem", 50000);

		FileOutputStream file = new FileOutputStream("D:\\New folder\\Employee1.txt");
		ObjectOutputStream os = new ObjectOutputStream(file);

		os.writeObject(emp);

		os.close();
		file.close();

		System.out.println("File created Successfully....!");
	}
}
