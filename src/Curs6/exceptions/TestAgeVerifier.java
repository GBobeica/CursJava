package Curs6.exceptions;

public class TestAgeVerifier {

	public static void main(String[] args) {
		AgeVerifier obj = new AgeVerifier();
		
		try {
			obj.checkAgeLimit(5);
			
		}catch (MyCustomException e) {
			System.out.println("You are not allowed to vote!");
			e.printStackTrace();
			
		}
		try {
			obj.checkAgeLimit(5);
			
		}catch (MyCustomException e) {
			System.out.println("You must be 18 to acces this site");
			e.printStackTrace();
			
		}
		

	}

}
