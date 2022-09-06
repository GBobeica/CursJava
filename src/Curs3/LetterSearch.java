package Curs3;

import java.util.Scanner;

public class LetterSearch {

	public static void main(String[] args) {
		
		
		System.out.println("Te rog introdu un text:");
        Scanner scan = new Scanner(System.in);
        String text = scan.next();
        
        int counter =0;
        boolean letterFound= false;
        
        for(int i =0; i<text.length(); i++) {
        	
        	char literaCurenta = text.charAt(i);
        	
        	if(literaCurenta == 'a' || literaCurenta == 'A'){
        			letterFound = true;
        			counter ++; 
        		
        	}
        	
        }
        
        
        if(letterFound) {
        	System.out.println("Litera A a fost gasita in text de " + counter + " ori");
        }else {
        	System.out.println("Litera A nu a fost gasita in text!");
        }
        
        
	}

}
