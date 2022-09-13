package Curs4;

public class TestReturnType {

	public static void main(String[] args) {
		TestReturnType obj = new TestReturnType(); 
		
		
		System.out.println("Salut " + obj.printeazaNume());
        System.out.println("Ce faci " + obj.printeazaNume());
        
        obj.printeazaPrenume();
        System.out.println("Salut " + obj.prenume); 
        
	}

	public String printeazaNume() {
		return "Oana";
		
	}
	
	String prenume;
	public void printeazaPrenume() {
		prenume = "Ion";
		
	}
	
}
