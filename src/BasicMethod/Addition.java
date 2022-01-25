package BasicMethod;

import java.util.Scanner;

public class Addition {
	Scanner sc = new Scanner (System.in);
	int num1;
	int num2;
	
	void addition() {
		System.out.print("Please enter the first number: ");
		num1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		num2 = sc.nextInt();
		System.out.println("The sum of the numbers is: "+(num1+num2));
	}

}
