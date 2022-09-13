package Curs5;

public class ArrayExample2 {

	public static void main(String[] args) {
		
		String [] culori = new String[5];
		// String[] culori = {null, null, null, null, null);
		culori[0] = "Galben";
		// String[] culori = {Galben, null, null, null, null);
		culori[1] = "Alb";		
		// String[] culori = {Galben, Alb, null, null, null);	
		culori[2] = "Negru";		
		culori[3] = "Verde";	
		culori[4] = "Rosu";	
		
				//System.out.println(culori[3]);
				
				
		//for clasic 		
				for(int i = 0; i <=4;  i++) {
                     System.out.println(culori[i]);
					
			
				}
				
				System.out.println("=================");
				//for each
				for(String element: culori ) {
					System.out.println(element);
				}
				
	}

}
