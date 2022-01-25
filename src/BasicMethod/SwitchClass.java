package BasicMethod;

import java.util.Scanner;

public class SwitchClass {
	
	void switchStatement() {
	Addition addition = new Addition();
	Subtraction subtraction = new Subtraction();
	Multiplication multiplication = new Multiplication();
	Division division = new Division();
	System.out.println("Please enter the operation that you want to perform: ");
	System.out.println("Press 1 for addition, 2 for subtraction, 3 for multiplication and 4 for division");
	Scanner sc = new Scanner(System.in);
	int operation = sc.nextInt();
	switch(operation) {
	case 1:
		addition.addition();
		break;
	case 2:
		subtraction.subtraction();
		break;
	case 3:
		multiplication.multiplication();
		break;
	case 4:
		division.division();
		break;
	default:
		System.out.println("Please enter a valid operation.");
		
	}
	}

}
