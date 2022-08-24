package sortingAlgo;

public class BubbleSort {

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for(int i = 0;i<arr.length-1;i++) {
			
			for(int firstNum = 0; firstNum<arr.length-i-1; firstNum++) {
				int secondNum = firstNum + 1;
				if(arr[firstNum] > arr[secondNum]) {
					int temp = arr[firstNum];
					arr[firstNum] = arr[secondNum];
					arr[secondNum] = temp;
				}
			}
		}
		
	}

	
	public static void printArray(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
			int[] arr = {10,1,7,9,4,5};
			printArray(arr);
//			bubbleSort(arr);
			System.out.println();
			printArray(arr);
	}

}
