package hashmap;

import java.util.HashMap;

public class MaximumFreqNumber {

	public static int maximumFreqNumber(int[] arr) {
		if(arr.length == 0) {
			return -1;
		}
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i<arr.length; i++) {
			
			if(map.containsKey(arr[i])) {
				// old number
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				
				// new number
				map.put(arr[i],1);
			}
		}
		
		int maxFreq = map.get(arr[0]);
		int maxFreqNum = arr[0];
		
		for(int i = 0 ;i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				int val = map.get(arr[i]);
				if(val > maxFreq) {
					maxFreq = val;
					maxFreqNum = arr[i];
				}
			}
		}
		
		return maxFreqNum;
	}
	
	public static void main(String[] args) {
//		int[] arr = {2,12,2,11,12,2,1,2,2,11,12,2,6};
		int[] arr = {1, 4, 5};
		System.out.println(maximumFreqNumber(arr));
	}

}
