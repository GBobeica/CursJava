package Curs7;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		//List<String>
		
		Map<String, String> map = new HashMap<>();
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		map.put("T", "Tester");
		map.put("D", "Developer");
		map.put("M", "Manager");
		map.put("P", "ProductManager");
		
		
		System.out.println(map.get("T"));
		System.out.println(map.get("P"));
		
		System.out.println(map.get("Developer"));// --> parametrul trebuie sa fie tot timpul cheia nu valaorea
		
		
		System.out.println("========KEY============");
		
		
		System.out.println(map.containsKey("M"));
		System.out.println("========VALUE============");
		
		System.out.println(map.containsValue("Manager"));
		System.out.println(map.containsValue("Secretary"));
		
		System.out.println("====================");
		
		for(String key : map.keySet()) {
			System.out.println(key);
		}
		
		map.remove("T");
		
		System.out.println("====================");
		for(String value : map.values()) {
			System.out.println(value);
		}

	}

}
