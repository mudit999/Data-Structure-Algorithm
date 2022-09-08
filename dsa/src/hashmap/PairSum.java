package hashmap;

import java.util.HashMap;

public class PairSum {

	public static int pairSum(int[] arr) {
		
		if(arr.length == 0) {
			return 0;
		}
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int count = 0;
	
		for(int i = 0 ; i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
				
		for(int i = 0 ;i<arr.length;i++) {
			int keyReq = -(arr[i]);
			if(map.containsKey(keyReq)) {
				if(map.get(keyReq) > 0) {
					count++;
					map.put(keyReq, map.get(keyReq)-1);
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
//		int[] arr = {2,1,-2,2,3};
		int[] arr = {-2, -12, 2, 11, 12, -2, 1, -2, 2, -11, 12, 2, 6};
		System.out.println(pairSum(arr));
		System.out.println(-0);
		System.out.println('f'-'b');
	}

}
