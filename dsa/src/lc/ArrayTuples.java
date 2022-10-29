package lc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayTuples {

	// No duplicates present in array
	public static List<List<Integer>> arrayTuples(int[] arr, int target){

		List<List<Integer>> res = new ArrayList<>();
		int len = arr.length;
		for(int i = 0; i<len-1; i++) {
			for(int j =i+1; j<len; j++) {
				if(arr[i] + arr[j] == target) {					
					List<Integer> tempAns = new ArrayList<>();
					tempAns.add(arr[i]);
					tempAns.add(arr[j]);
					res.add(tempAns);
//					System.out.println(arr[i] + " " + arr[j]);
				}
			}
		}
		return res;
	}
	
	
	public static List<List<Integer>> twoSumOptimized(int[] arr, int target){
		List<List<Integer>> res= new ArrayList<>();
		HashMap<Integer,Integer> map = new HashMap<>();
		
		// traverse array
		for(int i =0; i<arr.length; i++) {
			// if complement is present
			if(map.containsKey(target-arr[i])) {
				List<Integer> tempAns = new ArrayList<>();
				tempAns.add(arr[i]);
				tempAns.add(target-arr[i]);
				res.add(tempAns);
				
				// remove the element from map so that, res does not consider duplicates elem from int[] arr
				map.remove(target-arr[i]);
			}else {
				map.put(arr[i], i);
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		int arr[] = {0,-4,-1,2,-3,1,-4};
		List<List<Integer>> finalAns = twoSumOptimized(arr, -2);		
//		for(int i = 0 ; i<te.size(); i++) {
//			System.out.println(te.get(i));
//		}
		
		System.out.println(finalAns);
	}
}