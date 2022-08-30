package Curs1;

public class PrimulPogramJava {
	
	String prenume = "Oana"; //instance variabile --> are nevoie de un obiect al clasei pentru a o accesa
	int numar = 3; 
	char caracter = '@';


	 public static void main(String[] args) {
		 //obiectul clasei care imi permite sa accesez variabile si metode din clasa respectiva 
		 PrimulPogramJava obj =  new PrimulPogramJava();
		 
		 String salut = "Buna ";
		 System.out.println(salut+ obj.prenume); 
	 }

} 