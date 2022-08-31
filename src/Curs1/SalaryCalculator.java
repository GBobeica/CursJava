package Curs1;

public class SalaryCalculator {

	public static void main(String[] args) {

		Tester tester1Obj = new Tester();
		tester1Obj.setNume("Oana");
		tester1Obj.setRatePerHour(25);
		
		Tester tester2 = new Tester();
		tester2.setNume("Maria");
		tester2.setRatePerHour(30);
		
        Tester tester3 = new Tester();
        tester3.setNume("Ana");
        tester3.setRatePerHour(45);
        tester3.setAge(25);
		
		//System.out.println(tester1Obj.getNume());
		//System.out.println(tester2.getNume());
		
		SalaryCalculator obj =  new SalaryCalculator();
		System.out.println("Salariul lui " + tester2.getNume() + " este " + obj.calculateSalary(tester2.getRatePerHour()));
       
        
      
		System.out.println(tester3.getNume() + " are " + tester3.getAge() + " ani!");
        
		
	}
	
	public int calculateSalary(int plataPeOra) {
	
		int salary = plataPeOra * 40;
	
		return salary;
	
	}
	

}
