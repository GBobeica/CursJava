package Curs7;

public class GenericExample {

	public static void main(String[] args) {
		
				
  GenericExample obj = new GenericExample();
  obj.printDetails("String");
  obj.printDetails(1234);
  obj.printDetails(true);
		
	}
	
	
	public <T> void printDetails(T text) {
		System.out.println(text);
		
		
		
		
	}

}
