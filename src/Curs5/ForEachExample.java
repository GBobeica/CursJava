package Curs5;

public class ForEachExample {

	public static void main(String[] args) {
		
		String [] orase = {"Iasi", "Cluj", "Brasov", "Alba", "Pitesti"};
		
		for(String city : orase) {
			
			if(city.equals("Cluj")) {
				//System.out.println("Cluj este frumos!");
				//break;  //--> ma scoate din for 
				continue; //--> face skip la conditie si continua for-ul(nu afiseaja Cluj)
				
			}
			
			System.out.println(city);
			
		}
		
		
	}

}
