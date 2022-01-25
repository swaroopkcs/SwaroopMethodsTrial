package MethodTrial;

public class AccountNumbers {

	void accountList(float accNumber){
		float[] accountNumbers = {1234, 4567, 8975, 2434};
		Account1234 account1234 = new Account1234();
		Account2434 account2434 = new Account2434();
		Account4567 account4567 = new Account4567();
		Account8975 account8975 = new Account8975();
			if(accNumber==accountNumbers[0]) {
				account1234.accountDetails();
			} else if(accNumber==accountNumbers[1]) {
				account4567.accountDetails();
			} else if(accNumber==accountNumbers[2]) {
				account8975.accountDetails();
			} else if(accNumber==accountNumbers[3]) {
				account2434.accountDetails();
			}else
				System.out.println("Please enter a valid account number");

	}
}
