package MethodTrial;

import java.util.Scanner;

public class Account2434 {
	void accountDetails() {
		double balance = 25430.14;
		double prevBalance = 825.24;
		double lastMonthDeposits = 1420.34;
		System.out.println("The current balance in your account is: "+balance);
		System.out.println("The previous balance in your account is: "+prevBalance);
		System.out.println("The amount of deposits last month is :"+lastMonthDeposits);
		WithdrawalAmount withdrawalAmount = new WithdrawalAmount();
		InterestCalc interestCalc = new InterestCalc();
		System.out.println("Press 1 to see the amount of your last withdrawal");
		System.out.println("Press 2 to see the interest that you would accumulate if transferred to savings at a rate of 2.5%");
		System.out.println("Press 3 to exit");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice){
		case 1:
			withdrawalAmount.withdrawal(balance, prevBalance, lastMonthDeposits);
			break;
		case 2:
			interestCalc.interest(balance);
			break;
		case 3:
			System.out.println("Thank you for using the application");
			
		}
	}

}
