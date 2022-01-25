package Arrays;

import java.util.Scanner;

public class PopulatingArrayfromScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the number of employees");
		int i = sc.nextInt();
		String nameofEmployee[] = new String[i];
		double salaryofEmployee[] = new double[i];
		for(i=0; i<nameofEmployee.length; i++) {
			System.out.println("Please enter the name of employee:  "+(i+1));
			nameofEmployee[i] = sc.next();
			System.out.println("Enter the salary for "+nameofEmployee[i]);
			salaryofEmployee[i] = sc.nextDouble();
		}
		System.out.println("Enter the Sl. Number for the employee that you want to see: ");
		int slNumber = sc.nextInt();
		for (i=0;i<nameofEmployee.length;i++) {
			if(slNumber==(i+1)) {
				System.out.println("The name of the emploee is: "+nameofEmployee[i]);
			    System.out.println("The salary of the employee is: "+salaryofEmployee[i]);
			    break;
			} else {
				System.out.println("Please enter a valid Sl. Number.");
			}
		}
		int count = 0;
		System.out.println("Please enter the salary that yo want to find");
		double checkForSalary = sc.nextDouble();
		for(i=0;i<salaryofEmployee.length;i++) {
			if(checkForSalary==salaryofEmployee[i]) {
				count = count+1;
				System.out.println("The employee "+nameofEmployee[i]+" has a salary of "+checkForSalary);
			} else {
				System.out.println("No employee has a salary of "+checkForSalary);
			}
		}
		System.out.println("The total number of employees who has a salary of "+checkForSalary+" are"+count);
		

	}

}
