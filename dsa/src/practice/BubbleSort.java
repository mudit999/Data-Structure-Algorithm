package practice;

public class BubbleSort {

	public static void bubbleSort(int[] arr) {
		int k = arr.length-1;
		while(k>=0) {
			for(int i =0;i<=k;i++) {
				
				// compare first and second
				int j = i+1;
				if(j<arr.length) {
					// ascending
					if(arr[i] <= arr[j]) {
						continue;
					}else {
						// if desc -> swap them
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			k--;
		}
	}
	
	public static void main(String[] args) {
			int[] arr = {10,9,7,9,4,5};
			SelectionSort.printArr(arr);
			System.out.println();
			bubbleSort(arr);
			SelectionSort.printArr(arr);
	}
}
