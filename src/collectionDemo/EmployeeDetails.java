package collectionDemo;

public class EmployeeDetails {
	private String nameOfEmployee;
	private int employeeId;
	private double salary;
	public EmployeeDetails(String nameOfEmployee, int employeeId) {
		super();
		this.nameOfEmployee = nameOfEmployee;
		this.employeeId = employeeId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getNameOfEmployee() {
		return nameOfEmployee;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	

}
