package Curs6.exceptions;

public class AgeVerifier {
	
	public void checkAgeLimit(int age) throws MyCustomException {
		
		if (age < 18) {
			throw new MyCustomException("Invalid age to preceed!");
						
		}else {
			System.out.println("You are allowed!");
		}
		
	}
	
	
	

}
