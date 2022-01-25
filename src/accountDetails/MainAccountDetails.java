package accountDetails;

import java.util.Scanner;

public class MainAccountDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccountName swaroopAccount = new AccountName();
		swaroopAccount.accountName = "Swaroop Krishna";
		String swaroopAccountName = swaroopAccount.getAccountName();
		System.out.println("Name on the account: "+swaroopAccountName);
		AccountBalance swaroopAccountBalance = new AccountBalance();
		swaroopAccountBalance.balance = 5497.23;
		double swaroopBalance = swaroopAccountBalance.accountBalance();
		System.out.println("The balance on the account is: "+swaroopBalance);
		Scanner sc = new Scanner (System.in);
		AccountPhNum swarAccountPhNum = new AccountPhNum();
		swarAccountPhNum.phoneNumber = 4561237890f;
		float phNumberSwar = swarAccountPhNum.getPhNumber();
		System.out.println("The phone number on the account is: "+phNumberSwar);
		System.out.println("Please enter the amount that you want to deposit: ");
		double deposit = sc.nextDouble();
		swaroopAccountBalance.setAccountBalance(swaroopBalance, deposit);
		swaroopBalance = swaroopAccountBalance.accountBalance();
		System.out.println("The new balance for "+swaroopAccountName+" is "+swaroopBalance);
		System.out.println("Press Y if you want to change your phone number: N to exit");
		String choice = sc.next();
		if(choice.equals("Y")) {
			System.out.println("Please enter your new phone number");
			float newPhoneNum = sc.nextFloat();
			swarAccountPhNum.setPhNumber(newPhoneNum);
			float printNewPh  = swarAccountPhNum.getPhNumber();
			System.out.println("The new Phone Number is: "+printNewPh);
		} else
			System.out.println("Thanks for using the application");
	}

}
