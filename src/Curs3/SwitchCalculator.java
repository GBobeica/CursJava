package Curs3;

import java.util.Scanner;

public class SwitchCalculator {
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
		
		switch(operation) {
		
		case '+' :
			result = num1 + num2; 
			printResults();
			break;
			
		case '-' :
			result = num1 - num2; 
			printResults();
			break;	
			
		case '*' :
			result = num1 * num2; 
			printResults();
			break;	
			
		case '/' :
			result = num1 / num2; 
			printResults();
			break;	
			
			default:
				System.out.println("Wrong operation! Please inser only: =,-,*,/");
			
		}
		
	}
	
	public void printResults() {
		System.out.println(num1 + " " + operation + " " + num2 + " =" + result+"!");
	}
	

}
