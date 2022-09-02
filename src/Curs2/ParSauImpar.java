package Curs2;

import java.util.Scanner;

public class ParSauImpar {
	int numar; 
	
	public void intreabaUnNumar() {
		
		System.out.println("Te rog sa introduci un numar :");
		Scanner scan = new Scanner(System.in);
		numar = scan.nextInt(); 
		
	}
	
    public void verificaParSauImpar() { 
	
	if(numar % 2 == 0  ) {
		System.out.println(numar + "este par!");
		
	}else {
		System.out.println(numar + "este impar!");
	}
	
}
	

}
