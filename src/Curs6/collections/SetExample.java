package Curs6.collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		System.out.println(set.size());
        // adauga in set
		set.add("Bacau");
		set.add("Iasi");
		set.add("Oradea");
		set.add("Alba");
		set.add("Constanta");
		
		for(String oras : set) {
			System.out.println(oras);
			
		}
		//verifica daca contine un anumit element
		System.out.println(set.contains("Iasi"));
		
		//sterge element din set
		set.remove("Alba");
		
		System.out.println("==============");
		for(String oras : set) {
	    System.out.println(oras);
	    
		} 
		
		//sterge toate elementele
		set.clear();
		
		System.out.println("Set size after clear : " + set.size());
		
	}

}
