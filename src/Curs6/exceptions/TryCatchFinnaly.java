package Curs6.exceptions;

public class TryCatchFinnaly {

	public static void main(String[] args) {
		
		try {
			String nume = null;
			System.out.println(nume.length());
			
		}catch(Exception e) {
			System.out.println("Some error occured");
			
		}finally {
			System.out.println("Finally block of code!");
			
		}
		
		
		
		

	}

}
