package Curs5;

public class ArrayExample {

	public static void main(String[] args) {
		
		String [] orase = {"Iasi", "Cluj", "Brasov", "Alba", "Pitesti"};
          //    index   	0        1       2        3        4	
		
		//System.out.println(orase[3]);
		//System.out.println(orase[1]);
		//System.out.println(orase[0]);
		//System.out.println(orase.length);
		
	//	System.out.println(orase[5]);
		
		// clasic for
		for (int i=0; i < orase.length; i++) {
			
			System.out.println(orase[i]);		
			
		}
		System.out.println("--------------------");
		//for each
		for(String element : orase ) {
		System.out.println(element);
			
			
		}
		
		
	}

}
