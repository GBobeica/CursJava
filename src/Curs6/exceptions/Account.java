package Curs6.exceptions;

import java.util.Scanner;

public class Account  {

	
	private int accountNumber;
	public double balance;
	public String accountOwner;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccountOwner() {
		return accountOwner;
	}
	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}
	
	
public void Withdraw () {
	int widraw;
	
	System.out.println("Please enter the amount to widraw: ");
	Scanner scan = new Scanner(System.in);		
	widraw = scan.nextInt();
	
}
	
}

