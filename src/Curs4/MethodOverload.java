package Curs4;

public class MethodOverload {

	public static void main(String[] args) {
		
		
		System.out.println("doi"); //String
		System.out.println(2);  //integer
		System.out.println(2.0); //double - nr cu zecimale
		System.out.println('2'); //char 
		
	System.out.println("200");
		
		System.out.println("--------------------------");
		
		MethodOverload obj = new MethodOverload();
		obj.printeaza("Doi"); //String
		obj.printeaza(2);     //int 
		 System.out.println(obj.multiply(4.5, 6)); 
		
	}
	
	
	public void printeaza(String ceva) {
		System.out.println(ceva);
	

	}
	
	public void printeaza(int ceva) {
		System.out.println(ceva);
	} 
	
	
	public int multiply(int a, int b) {
		
		return a * b;
		
	}
	
	public double multiply(double a, double b) {
		
		return a * b;
	}

}
