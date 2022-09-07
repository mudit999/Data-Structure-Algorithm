package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class removeDuplicates {

	public static ArrayList<Integer> removeDuplicatesFromArray(int[] arr){
		
		ArrayList<Integer> output = new ArrayList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();
		
		for(int i = 0 ; i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				continue;
			}
			
			output.add(arr[i]);
			map.put(arr[i], true);
		}
		return output;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,2};
		ArrayList<Integer> output = removeDuplicatesFromArray(arr);
		System.out.println(output);
	}

}
