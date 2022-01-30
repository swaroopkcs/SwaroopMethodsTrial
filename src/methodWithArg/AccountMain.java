package methodWithArg;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter your Account Number: ");
		String accountNum = sc.next();
		System.out.println("Please enter your PIN");
		int pinEntered = sc.nextInt();
		AccountOperation aOperation = new AccountOperation();
		boolean cardVerified = aOperation.cardValidation(accountNum, pinEntered);
		aOperation.depositCash(cardVerified);	
	}

}
