package practice;

public class InsertionSort {
	
	public static void insertionSort2(int[] arr) {
		for(int i = 1; i<arr.length; i++) {
			int current = arr[i];
			int j;
			for(j = i-1; j>=0;j--) {
				if(current < arr[j]) {
					arr[j+1] = arr[j];
				}else {
					break;
				}
			}
			arr[j+1] = current;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {10,5,1,4,3,9};
		SelectionSort.printArr(arr);
		System.out.println();
		insertionSort2(arr);
		SelectionSort.printArr(arr);
	}

}
