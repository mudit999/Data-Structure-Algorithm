package weeklyProblems;

public class Week3 {
	
	// TC: O(m + n)
	// SC: O(m + n)
	public static void mergeSortedArray(int a[], int b[]) {
		int i = 0; // a array index 
		int j = 0; // b array index
		int z = 0; // c array index
		int c[] = new int[a.length + b.length];

		while(i<a.length && j<b.length){
		 if(a[i] > b[j]){
			c[z] = b[j];
			j++;
		}else{
			// a[i] <= b[j] condition
			c[z] = a[i];
			i++;
		}
		z++;
		}

		while(i<a.length){
			c[z] = a[i];
			i++;
			z++;
		}

		while(i<b.length){
			c[z] = b[j];
			j++;
			z++;
		}
	}
	
	
	 // TC: O(m + n)
     // SC: O(1)
    public void mergeTwoSortedArrayInPlace(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1; // index for nums1 array 
        int j = n-1; // index for nums2 array
        int z = nums1.length-1; // index for placing biggest b/w i and j pos. array
        
        // traverse nums2 array in reverse direction 
        while(j>=0 && i>=0 && z>=0){
            // find bigger of both
            if(nums2[j] > nums1[i]){
                nums1[z] = nums2[j];
                j--;
            }else{
                nums1[z] = nums1[i];
                i--;
            }
            z--;
        }
        
        // if nothing to compare from nums1 array, and j is still >= 0
        // copy all elements from nums2 array into nums1 array
        while(j>=0){
            nums1[z] = nums2[j];
            j--;
            z--;
        }
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
