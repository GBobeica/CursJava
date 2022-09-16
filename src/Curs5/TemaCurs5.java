package Curs5;

import java.util.Scanner;

public class TemaCurs5 {
	
	


	public static void main(String[] args) {
		
		int numar;
		
		String [] lunileAnului = {"Ianuarie", "Februarie", "Martie", "Aprilie", "Mai", "Iunie", "Iulie", "August", "Septembrie", "Octombrie","Noiembrie", "Decembrie"}; 
				
		
		
		System.out.println("Scrieti numarul: ");
		Scanner scan = new Scanner(System.in);		
		  numar = scan.nextInt();
	
		
	      for (int i=0; i <lunileAnului.length; i++ ) {
           if (numar>0 && numar<13 ) {
				System.out.println(numar + " reprezinta luna " + lunileAnului[numar-1]);
				break;
           //  i++;
             
			}else {
				System.out.println("Numar invalid, introduceti un numar intre 1 si 12: " );
				numar = scan.nextInt();
			}
	      
	   }
	
   }
}


