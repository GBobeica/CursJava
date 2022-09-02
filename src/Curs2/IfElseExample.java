package Curs2;

import java.util.Scanner;

public class IfElseExample {
	
	String username = "test";
	String password = "test123";
    String user;
    String pass; 
	
	
	public static void main(String[] args) {
		
		IfElseExample obj = new IfElseExample();
		obj.intreabaCredentiale();
		obj.verificaCredentiale();
		
        
        //operatorul And --> &&
        // operatorul OR --> ||
        
		
		
	}
	
	public void intreabaCredentiale() {
		System.out.println("Introdu un username:");
		Scanner scan = new Scanner(System.in);
		 user = scan.next(); 
		System.out.println("Introdu o parola:");
         pass = scan.next(); 
		
	} 
	
	public void verificaCredentiale () {	
		
        if(username.equals(user) && password.equals(pass)) {
        	System.out.println("Login sucessfull");
        	
        }
        else {
        	System.out.println("Username or password is wrong!");
        }
	}

}

