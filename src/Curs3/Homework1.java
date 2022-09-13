package Curs3;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		/*
		 * Folosind un FOR scriem un program care verifica daca un cuvant este Palindrom
		 * EX: radar
		 */
		
		System.out.println("Te rog introdu un cuvant");
		Scanner scan = new Scanner(System.in);
		String cuvant = scan.next();
		String cuvantInvers = scan.next();
		

		
		boolean literaCurenta= true;
		
		for( int i = literaCurenta.length - 1 ; i>=0 ; i-- ) {
			
			
			cuvantInvers = cuvantInvers + literaCurenta[i];
			
			//char literaCurenta = cuvant.charAt(i);
			//letterMatch = true;
			//counter++;
	}
	
	}
	{
	if(cuvant.equals(cuvantInvers)) {
		System.out.println("Cuvantul ESTE un Palindrom!");
	}else {
		System.out.println("Cuvantul NU ESTE un Palindrom");
}
}
}
