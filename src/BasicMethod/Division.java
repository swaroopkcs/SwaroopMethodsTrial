package BasicMethod;

import java.util.Scanner;

public class Division {
	Scanner sc = new Scanner (System.in);
	int num1;
	int num2;
	
	void division() {
		System.out.print("Please enter the Dividend: ");
		num1 = sc.nextInt();
		System.out.print("Enter the Divisor: ");
		num2 = sc.nextInt();
		System.out.println("The quotient of the numbers is: "+(num1/num2)+" and the reminder of the operation is "+(num1%num2));
	}
}
