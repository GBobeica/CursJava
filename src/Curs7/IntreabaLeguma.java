package Curs7;

import java.io.IOException;
import java.util.Scanner;

public class IntreabaLeguma {

	
	public static void main(String[] args) throws IOException  {
	
	  String leguma;
		
		 System.out.println("Introdu o leguma");
		 Scanner scan = new Scanner(System.in);
		 leguma = scan.next(); 	
	
		if(leguma  ) { 
			System.out.println("Leguma aleasa de tine are " +    +"Calorii");
			
	}else {
			System.out.println("Nu vindem aceasta leguma, va rugam alegeti alta leguma");
		    leguma = scan.next();
	}
	}

}
