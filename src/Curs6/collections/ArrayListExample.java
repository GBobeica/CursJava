package Curs6.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		System.out.println("Size: "+ list.size());
		//add in list 
		list.add("oana");
		list.add("ion");
		list.add("maria");
		list.add("carmen");
		
		System.out.println("Size: "+ list.size());
		//add to specific index
		list.add(0, "alina");
		
		for(String nume : list) {
			//print element with index
			System.out.println(list.indexOf(nume) + " : " + nume);
			
		}
		
		System.out.println("==========================");
		
		
		list.add(3, "george"); 
		
		for(String nume : list) {
			//print element with index
			System.out.println(list.indexOf(nume) + " : " + nume);
		
	}
		
		//get element via index
		System.out.println(list.get(4));
		
		//remove element
		list.remove(0);
		list.remove("ion");
		
		System.out.println("==========================");
		
		for(String nume : list) {
			//print element with index
			System.out.println(list.indexOf(nume) + " : " + nume);
		
		}
		
		System.out.println("==========================");
		//clear akk ekements from list
		list.clear();
		System.out.println("Size after claer(): " + list.size());
		
	}
}



