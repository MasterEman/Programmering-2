package bankAccount;

public class bankAccount {

	private String name;
	private double accountNumber;
	private double balance;
	
	public bankAccount(String name, double accountNumber, double balance) {
		this. name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	
	public double getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
