package Curs3;

import java.util.Scanner;

public class Calculator {
	
	
	/*
	 * Calculator simplu pentru operatiile +,-,/,* cu 2 numere
	 * 
	 * intrebam userul numarul 1
	 * intrebam userul operatia matematica
	 * intrebam userul numarul 2
	 * printam operatia si rezultatul
	 * 
	 * ex:2+3=5
	 * 
	 */
	
	int num1;
	int num2;
	char operation;
	int result;
	
	
	public void askTheUser() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		num1 = scan.nextInt();	
		System.out.println("Please enter the operation: ");
		operation = scan.next().charAt(0);
		System.out.println("Please enter the second number");
		num2 = scan.nextInt();
		
		
	}
	
	
	public void calculateValues() {
		askTheUser();
		
		if (operation == '+') {
			result = num1 + num2;
			printResults();
		}else if (operation == '-') {
			result = num1 - num2;
			printResults();
		}else if (operation == '/') {
			result = num1 / num2; 
			printResults();
		}else if (operation == '*') {
			result = num1 * num2;
			printResults();
		}else {
			System.out.println("Wrong operation! Please inser only: =,-,*,/ ");
		}
		
	}

public void printResults() {
	System.out.println(num1 + " " + operation + " " + num2 + " =" + result+"!");
}
	
}
