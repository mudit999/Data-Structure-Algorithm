package hashmap;

import java.util.HashMap;
import java.util.Set;

public class Basics {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		// insert
		map.put("abc", 1);
		map.put("abc1", 1);
		map.put("def", 2);
		
		int val0 = 0;
		if(map.containsKey("ab2c")) {
			val0 = map.get("abc");
		}
		System.out.println(val0);
		
		map.put("abc", 32);

		// presence
//		System.out.println(map.containsKey("ab2c"));
		
		// get value
//		int val = map.get("abqc");
//		System.out.println(val);
		
		map.remove("abc11");
		System.out.println(map.containsKey("abc1"));
		System.out.println(map.size());
		
		// iterate
		Set<String> keys = map.keySet();
		for(String item : keys) {
			System.out.println(item);
		}
		
		System.out.println(map.containsValue("aedf"));
 
	}

}
