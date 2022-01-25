package MethodTrial;

public class WithdrawalAmount {
	void withdrawal(double bal, double prevBal, double deposit) {
		double withdrawalAmount = bal - (prevBal + deposit);
		System.out.println("The amount of withdrawal last month is: " + withdrawalAmount);
	}

}
