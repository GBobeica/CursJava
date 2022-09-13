package Curs3;

import java.util.Scanner;

public class Homework3 {

	
	
	public static void main(String[] args) {
		System.out.println("Introdu primul numar :");
		Scanner scan = new Scanner(System.in);
		int numar1 = scan.nextInt();
		System.out.println("Introdu al doilea numar :");	
		int numar2 = scan.nextInt();
		
		System.out.println("Numerele pare sunt: ");
		
		for (int i = numar1; i <= numar2; i++){
			if (i % 2==0)
			System.out.println(i);
		}
		
		System.out.println("--------------------------------");
		
	
		int j = numar1;
		
		while(j<=numar2) {
			if (j % 2==0) {
				System.out.println(j);
			}
			j++;
			
			
		}
		
			
		}

	}


