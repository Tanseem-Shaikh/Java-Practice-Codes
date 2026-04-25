package ScannerClass;
// Take employee name, id, and salary and print employee details.

public class Employee {
	private String emp_name;
	private int emp_id;
	private double salary;

	public Employee(String emp_name, int emp_id, double salary) {
		this.emp_name = emp_name;
		this.emp_id = emp_id;
		this.salary = salary;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// toString() method
	@Override
	public String toString() {
		return "Employee [Name=" + emp_name + ",Id=" + emp_id + ",Salary=" + salary + "]";

	}
}
