package leetcode;

public class MergeSortedArrays {
	
	public static void mergeIt(int[] nums1, int[] nums2, int m, int n) {
		int i = 0;
        int j = 0;
        
        while(i<m && j<n){
            if(nums1[i] <= nums2[j]){
                i++;
            }else if(nums1[i] > nums2[j]){

             int temp = nums1[i];
             nums1[i] = nums2[j];
             nums2[j] = temp;
             i++;
             j++;
            }
        }
        
        j = 0;
        while(j<n){
            nums1[i] = nums2[j];
            i++;
            j++;
        }
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		
		int[] nums1 = {4,5,6,0,0,0};
		int[] nums2 = {1,2,3};
		printArray(nums1);
		System.out.println();

		printArray(nums2);
		System.out.println();
		int m = 3;
		int n = 3;
		
		mergeIt(nums1,nums2,m,n);
		
		printArray(nums1);

	}

}
