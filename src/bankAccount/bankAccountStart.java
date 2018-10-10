package bankAccount;

import bankAccount.bankAccount;

public class bankAccountStart {

	public static void main (String[] args) {
		
		bankAccount ba0 = new bankAccount("Emanuel Kulich", 1, 1337.69);
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Welcome to your account, " + ba0.getName());
		System.out.println(" ");
		System.out.println("Account Number: " + ba0.getAccountNumber());
		System.out.println("Balance: " + ba0.getBalance());
		System.out.println("--------------------------------------------------------------------");
		
/*		System.out.println(" ");
		System.out.println(" ");
		
		bankAccount ba1 = new bankAccount("Jacob Nilsson", 2, 0);
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Welcome to your account, " + ba1.getName());
		System.out.println(" ");
		System.out.println("Account Number: " + ba1.getAccountNumber());
		System.out.println("Balance: " + ba1.getBalance());
		System.out.println("--------------------------------------------------------------------"); */
	}
}
