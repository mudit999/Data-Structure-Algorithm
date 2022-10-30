package practice;

public class SelectionSort {

	// return index of smallest num
	public static int smallestValue(int start, int[] arr) {
		int res = Integer.MAX_VALUE;
		int resIndex = -1;
		for(int i = start; i<arr.length; i++) {
			if(arr[i] < res) {
				res = arr[i];
				resIndex = i;
			}
		}
		return resIndex;
	}
	
	public static void selectionSort(int[] arr) {
		// find smallest, swap with ith index
		for(int i =0; i<arr.length; i++) {
			int smIndex = smallestValue(i,arr);
			
			// swap value - ith value with sm value
			int temp = arr[i];
			arr[i] = arr[smIndex];
			arr[smIndex] = temp;
		}
	}
	
	public static void printArr(int[] arr) {
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {2,1,2,3};
		printArr(arr);
		System.out.println();
		selectionSort(arr);
		printArr(arr);
	}
}
