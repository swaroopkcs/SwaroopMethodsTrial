package collectionDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;  



public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ArrayList<EmployeeDetails> employeeDetails = new ArrayList<EmployeeDetails>();
		System.out.println("Avengers Incorporated");
		EmployeeDetails emp1 = new EmployeeDetails("Steve Rogers", 1234);
		emp1.setSalary(100000.45);
		EmployeeDetails emp2 = new EmployeeDetails("Tony Stark", 1235);
		emp2.setSalary(150000.89);
		EmployeeDetails emp3 = new EmployeeDetails("Thor Odin", 1236);
		emp3.setSalary(120000.45);
		EmployeeDetails emp4 = new EmployeeDetails("Black Widow", 1237);
		emp4.setSalary(130000.45);
		employeeDetails.add(emp1);
		employeeDetails.add(emp2);
		employeeDetails.add(emp3);
		employeeDetails.add(3, emp4);

		System.out.println("Print the salary for Employee 1");

		System.out.println(employeeDetails.get(employeeDetails.indexOf(emp1)).getSalary());
		System.out.println("Please find the employee you want to find");
		String employeeCheck = sc.nextLine();
		boolean isEmployeeFound = false;
		for (int i = 0; i < employeeDetails.size(); i++) {
			if (employeeDetails.get(i).getNameOfEmployee().equalsIgnoreCase(employeeCheck)) {
				isEmployeeFound = true;
				System.out.println("Name of Employee: " + employeeDetails.get(i).getNameOfEmployee());
				System.out.println("Employee ID     : " + employeeDetails.get(i).getEmployeeId());
				System.out.println("Salary          : " + employeeDetails.get(i).getSalary());
			}
		}
		if (!isEmployeeFound) {
			System.out.println("Employee not found");
		}
		EmployeeDetails findDetails = null;
		String notFound = "Employee not Found";
		//for(int i=0; i<employeeDetails.size();i++) {
		findDetails = employeeDetails.stream().filter(employeedetail -> employeeCheck.equalsIgnoreCase(employeeDetails.get(employeeDetails.indexOf(employeedetail)).getNameOfEmployee())).findAny().orElse(null); 
		//}
		System.out.println(findDetails.getNameOfEmployee());
		System.out.println(findDetails.getEmployeeId());
		System.out.println(findDetails.getSalary());
	}

}
