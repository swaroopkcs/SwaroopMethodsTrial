package collectionDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class ListOfAccounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		ArrayList<PersonDetails> accountList = new ArrayList<PersonDetails>();
		PersonDetails swaroopAccount = new PersonDetails("12345", "Swaroop", 1234);
		accountList.add(swaroopAccount);
		
		TFSAAccount user1 = new TFSAAccount("Tony Stark", 9154.23);
		TFSAAccount user2 = new TFSAAccount("Steve Rogers", 5962.12);
		TFSAAccount user3 = new TFSAAccount("Bruce Banner", 8915.12);
		ArrayList<TFSAAccount> tfsaAccounts = new ArrayList<TFSAAccount>();
		tfsaAccounts.add(user1);
		tfsaAccounts.add(user2);
		tfsaAccounts.add(user3);
		System.out.println("User1 Index: "+tfsaAccounts.indexOf(user1));
		System.out.println("User2 Index: "+tfsaAccounts.indexOf(user2));
		tfsaAccounts.remove(tfsaAccounts.indexOf(user1));
		tfsaAccounts.add(user1);
		System.out.println("User1 Index: "+tfsaAccounts.indexOf(user1));
		System.out.println("User2 Index: "+tfsaAccounts.indexOf(user2));
		System.out.println("Printing balance of User 1");
		System.out.println(tfsaAccounts.get(tfsaAccounts.indexOf(user1)).getBalance());
		System.out.println("");
		
		for (int i = 0; i<tfsaAccounts.size();i++) {
			System.out.println("User "+(i+1));
			System.out.println("-----------");
			System.out.println("Name   :"+tfsaAccounts.get(i).getAccountName());
			System.out.println("Balance: "+tfsaAccounts.get(i).getBalance());
			System.out.println("");
		}
		
		System.out.println("Please enter the name of the user that you want to find");
		String nameRequested = sc.nextLine();
		boolean isUserFound = false;
		for (int i=0;i<tfsaAccounts.size();i++) {
			if(tfsaAccounts.get(i).getAccountName().equalsIgnoreCase(nameRequested)) {
				isUserFound = true;
				System.out.println("Name   :"+tfsaAccounts.get(i).getAccountName());
				System.out.println("Balance: "+tfsaAccounts.get(i).getBalance());
			}
		}
		if(!isUserFound) {
			System.out.println("User not found");
		}
		
			

	}

}
