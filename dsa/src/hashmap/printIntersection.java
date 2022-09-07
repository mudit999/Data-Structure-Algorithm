package hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class printIntersection {
	
	public static void intersection(int[] arr1, int[] arr2) {
		
		if(arr1.length == 0 || arr2.length == 0) {
			return;
		}
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		// finding frequency of arr1 array
		for(int i = 0 ; i<arr1.length; i++) {
			if(map.containsKey(arr1[i])) {
				// old
				map.put(arr1[i], map.get(arr1[i])+1);
			}else {
				// new item
				map.put(arr1[i], 1);
			}
		}
		
		// to get console output in ascending order
		Arrays.sort(arr2);
				
		// check if arr2[i] is present in map
		for(int i = 0 ; i<arr2.length; i++) {
			if(map.containsKey(arr2[i])) {
				// check if freq is not 0
				int val = map.get(arr2[i]);
				if(val > 0) {
					// print it
					System.out.print(arr2[i] + " ");
					// decrement the freq of arr2[i]
					map.put(arr2[i], map.get(arr2[i])-1);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1,1,1,3,3,3,5,5};
		int[] arr2 = {1,1,3,3,5,5};
		intersection(arr1,arr2);
	}

}
