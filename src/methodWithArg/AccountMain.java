package methodWithArg;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		AccountOperation accountOperation = new AccountOperation();
		System.out.println("These are the intial values of your online account:");
		System.out.println("Username: "+accountOperation.userName);
		System.out.println("PIN: "+accountOperation.pin);
//		System.out.println("Please create your Username: ");
//		String userName = sc.next();
//		System.out.println("Please create your PIN: ");
//		int pin = sc.nextInt();
//		AccountOperation acOperation = new AccountOperation(userName, pin);
		AccountOperation acOperation2 = new AccountOperation("swaroop",1234);
		System.out.println("The account details are initialised. Now you can deposit your money.");
		System.out.println("Please validate your account:");
		System.out.println("");
//		System.out.println("Please enter your UserName: ");
//		String userNameEntered = sc.next();
//		System.out.println("Please enter your PIN");
//		int pinEntered = sc.nextInt();
		acOperation2.depositCash(acOperation2.userName, acOperation2.pin);
		sc.close();
	}

}
