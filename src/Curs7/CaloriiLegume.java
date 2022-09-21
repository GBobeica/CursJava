package Curs7;

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.Map;

public class CaloriiLegume {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		//System.out.println(map.size());
		
		map.put(58, "morcovi");
		map.put(33, "castraveti");
		map.put(44, "rosie");
		
		for(Integer key : map.keySet()) {
			System.out.println(key);
		
	}
	}
}
