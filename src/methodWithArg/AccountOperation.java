package methodWithArg;

import java.util.Scanner;

public class AccountOperation {
	String accountNumber = "1234567890123456";
	int pin = 1234;
	// boolean cardValidated = false;
	Scanner sc = new Scanner(System.in);
	double newBalance = 0;
	double accountBalance = 1500.55;

	boolean cardValidation(String accountNum, int pinEntered) {
		if (accountNum.equals(accountNumber) && pinEntered == pin) {
			return true;
		}
		return false;
	}

	void depositCash(String accountNum, int pinEntered) {
		if (cardValidation(accountNum, pinEntered)) {
			System.out.println("Please enter the amount that you want to deposit: ");
			double cashDeposited = sc.nextDouble();
			newBalance = accountBalance + cashDeposited;
			System.out.println("The new balance on the account is: "+newBalance);
		} else {
			System.out.println("The Account Aumber or PIN entered is incorrect");
		}
	}

}
