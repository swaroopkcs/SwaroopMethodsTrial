package accountDetails;

public class NewBalance {
	double finalBalance = 0;
	double newBalance(double deposit, double prevBal) {
		finalBalance = prevBal+deposit;
		return finalBalance;
	}

}
