package practice;
	
public class ArrayIndexElementEquality {
	
	// linear search
	public static int getAns(int[] nums) {
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == i) {
				return i;
			}
		}
		
		return -1;
	}
	
	// binary search
	public static int getAnsBinarySearch(int[] nums) {
		int start = 0;
		int end = nums.length-1;
		
		while(start <= end) {
			int mid = (start+end)/2;
			if(nums[mid] - mid < 0) {
				// go right
				start = mid+1;
			}else if(nums[mid] - mid > 0) {
				// go left
				end = mid-1;
			}else {
				// equals
				return mid;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] nums = {-8,1,2,5};
//		System.out.println(getAns(nums));
		System.out.println(getAnsBinarySearch(nums));
	}
}