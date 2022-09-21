package Curs7;

import java.awt.RenderingHints.Key;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CaloriiLegume {

	public static void main(String[] args) throws IOException {
		
		Map<String, Integer> map = new HashMap<>();
		//System.out.println(map.size());
	
		
		map.put("morcovi", 58 );
		map.put("castraveti", 33 );
		map.put("rosie", 44 );
		
		for(Integer value : map.values()) {
			System.out.println(value);
			
	
		
	}
	}
}

