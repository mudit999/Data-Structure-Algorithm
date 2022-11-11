package practice;

public class SlidingWindow {
	
	public static int maxSumWindowK(int[] arr, int k) {
		
		int i = 0; // start
		int j = 0; // end
		int sum = 0;
		int ms = Integer.MIN_VALUE;
		
		while(j < arr.length) {
			sum += arr[j];
			if(j-i+1 < k) {
				j++;
			}else if(j-i+1 == k) {
				ms = Math.max(ms, sum);
				sum = sum -arr[i];
				i++;
				j++;
			}
		}
		return ms;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,9,3,2,1,8,7};
		int k = 4;
		System.out.println(maxSumWindowK(arr,k));
	}
}