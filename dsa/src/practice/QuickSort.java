package practice;

public class QuickSort {
	
	public static int partition(int[] arr, int si, int ei) {
		int count = 0;
		// find pivot index
		for(int i = si+1; i<arr.length; i++) {
			if(arr[i] < arr[si]) {
				count++;
			}
		}
		
		// move pivot to it's right position
		// swap
		int pivotIndex = si+count;
		int temp = arr[si];
		arr[si] = arr[pivotIndex];
		arr[pivotIndex] = temp;
		
		
		// Now every num before pivotIndex must be smaller than arr[pivot]
		// Now every num after pivotIndex must be greater than arr[pivot]
		int start = si;
		int end = ei;
		
		while(start<end) {
			
			if(arr[start] < arr[pivotIndex]) {
				start++;
			}else if(arr[end] > arr[pivotIndex]) {
				end--;
			}else {
				// if found defaulter on both sides
				int tempVar = arr[start];
				arr[start] = arr[end];
				arr[end] = tempVar;
				start++;
				end--;
			}
		}
		
		return pivotIndex;
	}
	
	public static void QS(int[] arr, int si, int ei) {
		// base
		if(si >= ei) {
			return;
		}
		
		int pivotIndex = partition(arr, si, ei);
		QS(arr, si, pivotIndex-1);
		QS(arr,pivotIndex+1, ei);
	}
	
	public static void print(int[] a) {
		for(int item: a) {
			System.out.print(item + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = {2,39,9,5,66,4,32,6,4};
		print(arr);
		System.out.println();
		QS(arr,0,arr.length-1);
		print(arr);
	}

}
