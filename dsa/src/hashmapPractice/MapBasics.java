package hashmapPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapBasics {

	public static void main(String[] args) {
		Map<Character,Integer> map = new HashMap<>();
		
		map.put('a',1);
		map.put('b',20);
		map.put('c',3);
		map.put('g',10);
		map.put('l',300);
		

		Set<Map.Entry<Character,Integer>> keys = map.entrySet();
		
		for(Map.Entry<Character,Integer> key : keys) {
			System.out.println(key.getKey() + " " + key.getValue());
		}
		
		
	}

}
