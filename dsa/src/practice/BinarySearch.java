package practice;

public class BinarySearch {

	public static int binarySearch(int[] nums, int target) {
		int start = 0;
		int end = nums.length-1;
		
		while(start <= end) {
			int mid = (start+end)/2;
			int midElement = nums[mid];
			if(midElement < target) {
				// look in right side
				start = mid+1;
			}else if(midElement > target) {
				// look in left side
				end = mid-1;
			}else {
				// if equals
				return mid;
			}			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] nums = {10,12,13,15,20,25};
		int ans = binarySearch(nums, 15);
		System.out.println(ans);
	}

}
