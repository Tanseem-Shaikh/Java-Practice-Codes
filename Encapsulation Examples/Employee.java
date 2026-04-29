package com.mypackage;

public class Employee {
	private String emp_name;
	private String emp_id;
	private String city;
	private double salary;
	public String getemp_name() {
		return emp_name;
	}
 public void setemp_name(String emp_name) {
	this.emp_name=emp_name;
}
public String getemp_id() {
	return emp_id;
}
 public void setemp_id(String emp_id) {
this.emp_id=emp_id;
 }
 public String getcity() {
	 return city;
 }
 public void setcity(String city) {
	 this.city=city;
 }
 public double getsalary() {
	 return salary;
 }
 public void setsalary(double salary) {
	 this.salary=salary;
 }
}
