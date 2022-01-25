package MethodTrial;

import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter your account number");
		float accountNumber= sc.nextFloat();
		AccountNumbers accountNumbers = new AccountNumbers();
		accountNumbers.accountList(accountNumber);
	}

}
