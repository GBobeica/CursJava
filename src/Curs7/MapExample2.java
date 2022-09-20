package Curs7;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(404,  "Page not found");
		map.put(200,  "Ok");
		map.put(301,  "Redirect");
		
		
		System.out.println(map);
		
		Map<Integer, String> map2 = new HashMap<>();
		
		
		map2.put(201, "Created");
		map2.put(500, "Internal server error");
		map2.put(502, "Alt cod");
		
		
		System.out.println(map2);
		
		
		map.putAll(map2);
		System.out.println("=====================");
		System.out.println(map);
		

	}

}
