package BasicMethod;

import java.util.Scanner;

public class Subtraction {

	Scanner sc = new Scanner (System.in);
	int num1;
	int num2;
	
	void subtraction() {
		System.out.print("Please enter the first number: ");
		num1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		num2 = sc.nextInt();
		System.out.println("The difference of the numbers is: "+(num1-num2));
	}
}
