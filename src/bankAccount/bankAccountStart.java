package bankAccount;

import java.util.Scanner;

import bankAccount.bankAccount;

public class bankAccountStart {
	
	String fullName;
	
	private static Scanner scr;

	private static int accountNumber;

	public static void main (String[] args) {
		
		scr = new Scanner(System.in);
		
		System.out.println("---------------------------------------------------------");
		System.out.println("Welcome!");
		System.out.println(" ");
		System.out.println("If you have an account, please enter your details below: ");
		System.out.println("Full Name: ");
		String fullName = scr.nextLine();
		System.out.println("Account Number: ");
		setAccountNumber(scr.nextInt());
		
		
		
		if (fullName != null) {
		
			bankAccount ba0 = new bankAccount("Emanuel Kulich", 1, 1337.69);
			System.out.println("---------------------------------------------------------");
			System.out.println("Welcome to your account, " + ba0.getName());
			System.out.println(" ");
			System.out.println("Account Number: " + ba0.getAccountNumber());
			System.out.println("Balance: " + ba0.getBalance());
			System.out.println("---------------------------------------------------------");
			
		}
	}

	public static int getAccountNumber() {
		return accountNumber;
	}

	public static void setAccountNumber(int accountNumber) {
		bankAccountStart.accountNumber = accountNumber;
	}
}
