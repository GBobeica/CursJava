package Curs3;

import java.util.Scanner;

public class WhileLoopExample3 {
	/*
	 * Calculeaza salariul pe o saptamana
	 * Intrebam userul cate ore a lucrat
	 * calculam doar daca nr de ore este mai mic sau egal cu 40
	 * daca nr de ore nu este valid il rugam sa introduca un numar valid
	 * si facem asta pana avem un numar valid sa calculam
	 * 
	 */

	public static void main(String[] args) {
		int maxHoursWorked = 40;
		 int ratePerHour = 15;
		 
		 
		 System.out.println("Cate ore ai lucrat saptamana aceasta ?");
		 Scanner scan = new Scanner(System.in);
		 int hoursWorked = scan.nextInt();
		 
		 
		 while(hoursWorked > maxHoursWorked ) {
			 
			 System.out.println("Numar invalid de ore!");
			 System.out.println("Te rog introdu un nr de ore valid care sa fie mai mic decat 40");
			  hoursWorked = scan.nextInt();
		 }

		 System.out.println("Salariul de plata este: " + hoursWorked*ratePerHour);
		 
	}

}
