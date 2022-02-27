package methodWithArg;

import java.util.Scanner;

public class AccountOperation {
	String userName = "";
	int pin;
	// boolean cardValidated = false;
	Scanner sc = new Scanner(System.in);
	double newBalance = 0;
	double accountBalance = 1500.55;
	
	public AccountOperation() {
		// TODO Auto-generated constructor stub
		System.out.println("Create an online account:");
	}
	public AccountOperation(String actUserName, int pin) {
		// TODO Auto-generated constructor stub
		userName = actUserName;
		this.pin = pin;
	}

	boolean cardValidation(String accountNum, int pinEntered) {
		if (accountNum.equals(userName) && pinEntered == pin) {
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
			System.out.println("The Username or PIN entered is incorrect");
		}
	}

}
