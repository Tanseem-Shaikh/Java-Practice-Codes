package com.mypackage;

public class EmpMain {
public static void main(String[] args) {
	Employee e1=new Employee();
	e1.setemp_name("Rahul");
	e1.setemp_id("Rahul@123");
	e1.setcity("Pune");
	e1.setsalary(50000);
	
	System.out.println(e1.getemp_name());
	System.out.println(e1.getemp_id());
	System.out.println(e1.getcity());
	System.out.println(e1.getsalary());
}
}
