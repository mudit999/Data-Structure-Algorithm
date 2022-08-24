package recursion;

public class RecursionOnArray {

	public static boolean checkIfArraySorted(int[] arr) {
		
		// base case, there is only one element - sorted by itself 
		if(arr.length == 1) {
			return true;
		}
		
		// IS
		if(arr[0] > arr[1]) {
			return false;
		}
		
		int[] smallArray = new int[arr.length-1];
		
		for(int i = 1; i<arr.length; i++) {
			smallArray[i-1] = arr[i];
		}
		
		// IH
		boolean isSmallArraySorted = checkIfArraySorted(smallArray);
		return isSmallArraySorted;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,9};
		System.out.println(checkIfArraySorted(arr));
	}

}
