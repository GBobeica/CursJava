package Curs2;

//varianta 1

import java.util.Scanner;

public class Curs2Homework3 {
	
	String numar; 
	
	public void intreabaUnNumar() {
		System.out.println("Scrie un numar");
		Scanner scan = new Scanner(System.in);
		numar = scan.next();
		
	}

	public void afisamZiuaSaptamanii() {
		switch (numar){
		
		case "1":
			System.out.println("Ziua saptamanii este: luni");
			break;			
		case "2":
			System.out.println("Ziua saptamanii este: marti");
		   break; 
		case "3":
			System.out.println("Ziua saptamanii este: miercuri");
		   break;
		case "4":
			System.out.println("Ziua saptamanii este: joi");
		   break;
		case "5":
			System.out.println("Ziua saptamanii este: vineri");
		   break;
		case "6":
			System.out.println("Ziua saptamanii este: sambata");
		   break;  
		case "7":
			System.out.println("Ziua saptamanii este: duminica");
		   break;     
		   
		  default:
			  System.out.println("Te rugam sa introduci un numar intre 1 si7");
		   
		}
		
	}
	
}
