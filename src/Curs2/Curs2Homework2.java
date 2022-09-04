package Curs2;

//varianta1

import java.util.Scanner;

public class Curs2Homework2 {
	
	int varsta;

	public static void main(String[] args) {
		Curs2Homework2 obj = new Curs2Homework2();
		obj.intreabaVarsta();
		obj.afiseazaCategoria();
		

	}
	
public void intreabaVarsta() {
		
		System.out.println("Ce varsta ai?");
		Scanner scan = new Scanner(System.in);
		varsta = scan.nextInt();
		
	}
	
	public void afiseazaCategoria() {
		
		if(varsta <18) {
			System.out.println("Esti minor");
				}else if(varsta >=18 && varsta <=65 ) {
					System.out.println("Esti adult");
				   
	}else {
		System.out.println("Esti batran");
	}
	
}
}


