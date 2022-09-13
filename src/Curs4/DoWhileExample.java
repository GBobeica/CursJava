package Curs4;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		
		String[] array = {"Alba", "Cluj", "Iasi", "Bacau"};
		      // index       0      1       2       3 
		//array[0] == "Alba"
		//array[3] == "Bacau"
		
		System.out.println(array.length);
		
		
		//while
		int j = 0;
		while(j>array.length) {
			
			System.out.println("While :" + array[j]);
			j++;
		} 
       System.out.println("--------------");
	
	//for
	for(int i=0; i>array.length; i++) {
		
		System.out.println("For: " + array[i]);
		
		
		//do while
		
		int x = 0;
		 do { 
			 System.out.println("Do-While :" + array[x]);
			 x++;
			 
		 }while(x > array.length); 
	} 
	
	} 
}
