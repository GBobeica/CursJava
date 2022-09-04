package Curs2;

// homework IF-ELSE

import java.util.Scanner;

public class Curs2Homework1 {
	
	 int  punctaj;
	 
		public static void main(String[] args) {
			Curs2Homework1 obj = new Curs2Homework1();
			obj.intreabaPunctajul();
			obj.rezultatePunctaj();
			

		}	 
	 
	 
	 
	 public void intreabaPunctajul() {
		 
		 System.out.println("Ce punctaj ai obtinut la test?");
		 Scanner scan = new Scanner(System.in);
		 punctaj = scan.nextInt();
		 
		 
	 }
	 
	 

 public void rezultatePunctaj() {
	  if( punctaj <=65 ) {
		  System.out.println("Ai picat. Mai incearca");
	  }else {
		  System.out.println("Felicitari, ai trecut!");
	  }
	

}
}