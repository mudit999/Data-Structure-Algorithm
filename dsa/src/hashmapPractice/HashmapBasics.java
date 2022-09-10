package hashmapPractice;
import java.util.*;

public class HashmapBasics {

	// Two sum using Map
	public static int[] twoSum(int arr[], int target){
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i = 0 ; i <arr.length; i++) {
			map.put(arr[i], i);
		}
		
		for(int i = 0;i<arr.length;i++) {
			if(map.get(target-arr[i]) != null && map.get(target-arr[i]) != i) {
				int j = map.get(target-arr[i]);
				return new int[] {i,j};
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		int nums[] = {3,2,4};
		int target = 6;
		
		int[] arr = twoSum(nums,target);
		System.out.println(arr[0] + "  " + arr[1]); 
	}
}