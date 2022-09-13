package Curs5;

public class TestOvveride {

	public static void main(String[] args) {
		Developer dev = new Developer();
		dev.work();
		
		
		System.out.println("===================");
		
		
		Tester tester = new Tester();
		tester.work();

		
		Angajat tester1 = new Tester ();
		tester1.work();
		
	}

}
