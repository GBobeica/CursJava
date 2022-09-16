package Curs6.exceptions;

public class ExceptionExample {

	public static void main(String[] args) {
		
		String [] orase = {"Iasi", "Cluj", "Brasov", "Alba", "Pitesti"};
		
		
		System.out.println(orase.length);
		
		try { 
		
			System.out.println(orase[5]);
			
		}catch(ArrayIndexOutOfBoundsException err) {
			System.out.println("Ai incercat sa accesezi un index in afara array-ului");
			//err.printStackTrace();
			
		}
			
		
		
		
		System.out.println("Some code!");

	}

}
