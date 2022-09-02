package Curs2;

import java.util.Scanner;

public class Catalog {
	
	/*
	 * intrebam punctajul unui test
	 * 
	 * daca a obtinut <= 90 --> B
	 * daca a obtinut <= 80 --> C
	 * daca a obtinut <= 70 --> D
	 * daca a obtinut <= 60 --> E
	 * daca a obtinut > 90 --> A
	 * 
	 */
	
	
	char calificativ; 
	int punctaj; 
	
	public	void  intreabaPunctajul() {
		System.out.println("Ce punctaj ai obtinut ?");
		Scanner scan = new Scanner(System.in); 
		punctaj = scan.nextInt();		
		
	}
	
	public void acordaCalificativ() {
		System.out.println("Punctaj " + punctaj);
		if(punctaj <=60) {
			calificativ = 'E';
			
			
		}else if (punctaj <=70) {
			calificativ = 'D';			
		}else if (punctaj <=80) {
			calificativ = 'C';
		}else if (punctaj <=90) {
			calificativ = 'B';
		}else {
			calificativ = 'A';
		}
	}
	

	public void printeazaMesaj() {
		System.out.println("Calificativul primit este:" + calificativ);
	}
}
