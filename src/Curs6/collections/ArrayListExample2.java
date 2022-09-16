package Curs6.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
        list.add("alb");
        list.add("negru");
        list.add("rosu");
        list.add("verde");
        list.add("galben");
        list.add("albastru");
        
        System.out.println(list.size());
        
        for (String culoare : list) {
        	System.out.println(list.indexOf(culoare) + ":" + culoare);
        	
        }
        
        System.out.println("=====================");
        	
        list.subList(2, 4).clear();
        
        for (String culoare : list) {
        	
        	System.out.println(list.indexOf(culoare) + " : " + culoare);
        }
        
        //contains object
        
        String element = "alb";
        
        if(list.contains(element)) {
        	System.out.println("Contains element!");
        	
        }else {
        	System.out.println("Does not contain!");
        }
        		
     //update element
        list.set(3, "bleu");
        System.out.println("=====================");
        
        for (String culoare : list) {
        	
        	System.out.println(list.indexOf(culoare) + " : " + culoare);
	}

}
}
