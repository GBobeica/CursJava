package Curs2;

import java.util.Scanner;

public class SwitchExample {
	
	/*
	 * Intrebam utilizatorul ce calificativ a primit
	 * 
	 * Daca a primit A printam "Good job!"
	 * Daca a primit B printam "Not that Good!"
	 * Daca a primit C printam "Bad!"
	 * Daca a primit orice in afara de cele de mai sus printam "Please insert a valid grade!"
	 * 
	 * 
	 */
	String calificativ; 
	
	public void intrebamUnCalificativ() {
		System.out.println("Te rog intrody un calificativ");
		Scanner scan = new Scanner(System.in);
		 calificativ = scan.next();		
		
	}
public void felicitamStudentul() {
	
	switch(calificativ.toUpperCase()) {
	
	case "A":
		System.out.println("Good job!");
		break;
	case "B":
		System.out.println("Not that good!");
		break;
	case "C":
		System.out.println("Bad!");
		break;
	default:
		System.out.println("Please insert a valid grade!");
	}
}
	
}
