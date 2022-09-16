package Curs6.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample2 {

	public static void main(String[] args) {
		
		
		try { 
		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert number 1 : ");
        int number1= scan.nextInt();
        		System.out.println("Please insert number 2 : ");		
        int number2= scan.nextInt();
       // number2 = (Integer) null;
        System.out.println("Rezultatul impartirii lui " + number1 + " la " + number2 + " este " + number1/number2);
        
/*		}catch (ArithmeticException e) {
			System.out.println("Please do not divide by zero! It is not allowed!");
		}catch (InputMismatchException e) {
			System.out.println("Plesae enter only numeric values!");
		}catch (NullPointerException e) {
			System.out.println("Null pointer has occured!");*/
		}catch (Exception e) {
			System.out.println("Some exception was thrown!");
			e.printStackTrace();
			
		}
        
        
        System.out.println("Alt cod care vreau sa ruleze!");
        		
	}

}
