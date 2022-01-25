package methodWithArguments;

import java.util.Scanner;

public class MainMethodforOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		AddNumbers addNumbers = new AddNumbers();
		SubtractNumbers subtractNumbers = new SubtractNumbers();//Instantiating the method
		DivideNumbers divideNumbers = new DivideNumbers();
		MultiplyNumbers multiplyNumbers = new MultiplyNumbers();
		addNumbers.addition(10, 20);
		System.out.println("Please enter first number");
		int number1 = sc.nextInt();
		addNumbers.addition(number1, 20);
		System.out.println("Please enter second number");
		int number2 = sc.nextInt();
		System.out.println("Please enter the operation that you want to perform: ");
		System.out.println("Press 1 for addition, 2 for subtraction, 3 for multiplication and 4 for division");
		int operation = sc.nextInt();
		switch(operation) {
		case 1:
			addNumbers.addition(number1,number2);//Calling the method
			break;
		case 2:
			subtractNumbers.subtraction(number1,number2);
			break;
		case 3:
			multiplyNumbers.multiplication(number1,number2);
			break;
		case 4:
			divideNumbers.division(number1,number2);
			break;
		default:
			System.out.println("Please enter a valid operation.");
			
		}
	}

}
