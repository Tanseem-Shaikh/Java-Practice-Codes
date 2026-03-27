package mypackage;

public class Hospital {
	String hos_name;
	String hos_add;
	long hos_no;
	int noOfPatients;
	int noOfDocters;

	public Hospital(String hos_name, String hos_add, long hos_no, int noOfPatients, int noOfDocters) {
		this.hos_name = hos_name;
		this.hos_add = hos_add;
		this.hos_no = hos_no;
		this.noOfPatients = noOfPatients;
		this.noOfDocters = noOfDocters;
	}

	public void display() {
		System.out.println("Hospital information");
		System.out.println("Hospital Name : " + hos_name);
		System.out.println("Hospital Address : " + hos_add);
		System.out.println("Hospital Number : " + hos_no);
		System.out.println("Total Patients : " + noOfPatients);
		System.out.println("Total Docters: " + noOfDocters);

	}
}
