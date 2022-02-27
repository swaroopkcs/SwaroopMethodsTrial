package collectionDemo;

public class TFSAAccount {
	
	private String accountName;
	private double balance;
	public TFSAAccount(String accountName, double balance) {
		super();
		this.accountName = accountName;
		this.balance = balance;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
