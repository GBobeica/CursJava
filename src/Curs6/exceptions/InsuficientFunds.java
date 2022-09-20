package Curs6.exceptions;

import java.util.Scanner;

public class InsuficientFunds extends Account {
	
	


	public static void main(String[] args) {
		int balance;
		int widraw;
	
		try {
		
       for (balance < widraw) {
    	   System.out.println("The amount you entered is greater than the available balance: " + balance);
    	   System.out.println("Thank you for using our ATM! ");
       }
       
		}catch (Exception e) {
			System.out.println("Insuficient founds");
			e.printStackTrace();
		}
}
}

