package lc;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {
	
	public static String format(int one, int two) {
		String s = "";
		
		// if both are equal
		if(one == two) {
			return s + one;
		}
		// else
		return one + "->" + two;
	}

	public static List<String> missingRanges(int[] nums, int lower, int upper){
		
		// ans list
		List<String> ans = new ArrayList<>();
		
		// edge case if nums is empty
		if(nums.length == 0) {
			String s = format(lower,upper);
			ans.add(s);
			return ans;
		}
		
		// beginning
		if(lower < nums[0]) {
			String s = format(lower,nums[0]-1);
			ans.add(s);
		}
		
		// middle
		for(int i = 0; i<nums.length-1; i++) {
			
			// no missing range
			if(nums[i+1] == nums[i]+1) {
				continue;
			}else {
				// missing range
				
				String s = format(nums[i]+1, nums[i+1]-1);
				ans.add(s);
			}			
		}
		
		// end
		if(upper > nums[nums.length-1]) {
			String s = format(nums[nums.length-1]+1, upper);
			ans.add(s);
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		int nums[] = {0,1,3,50,79};
//		int nums[] = {1};
//		int nums[] = {0,1,3,50,79};
		
//		int nums[] = {};		
		int lower = -2;
		int upper = 99;
		
		List<String> ans = missingRanges(nums,lower,upper);
		System.out.println(ans);		
	}

}
