package accountDetails;

public class AccountBalance {
	double balance = 0;
	double accountBalance(){
		return balance;
	}
	void setAccountBalance(double prevBalance, double deposit) {
		balance = prevBalance+deposit;
	}

}
