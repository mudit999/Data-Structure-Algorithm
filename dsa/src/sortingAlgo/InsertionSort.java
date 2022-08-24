package sortingAlgo;

public class InsertionSort {
	
	public static void insertionSort(int[] arr) {
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
	
	public static void printArray(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
			int[] arr = {10,5,3,15,4};
			printArray(arr);
			insertionSort(arr);
			System.out.println();
			printArray(arr);
	}

}
