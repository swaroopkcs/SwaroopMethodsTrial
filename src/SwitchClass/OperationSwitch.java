package SwitchClass;

import java.util.Scanner;

public class OperationSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the first number:  ");
		int num1 = sc.nextInt();
		System.out.print("Please enter the second number:    ");
		int num2 = sc.nextInt();
		System.out.println("Please enter the device that you want to turn on");
		int button = 1;
		System.out.println("Press 1 for addition");
		System.out.println("Press 2 subtraction");
		System.out.println("Press 3 for multiplication");
		System.out.println("Press 4 for finding the quotient");
		button = sc.nextInt();
		switch (button) {
		case 1:
			System.out.print("The sum of the numbers is:  " + (num1 + num2));
			break;

		case 2:
			System.out.println("The difference of the numbers is:  " + (num1 - num2));
			break;

		case 3:
			System.out.println("The product of the numbers is:  " + (num1 * num2));
			break;

		case 4:
			System.out.println("The quotient of the operation is:  " + (num1 / num2));
			break;

		default:
			System.out.println("Not a valid operation");
		}
	}

}
