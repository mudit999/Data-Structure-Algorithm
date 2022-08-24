package recursion;

public class QuickSort {
	
	public static int partition(int[] a, int si, int ei) {
		// partition
		// find pivot right position
		int count = 0;
		for(int i = si+1; i<=ei; i++) {
			// find elements less than a[si]
			if(a[i] < a[si]) {
				count++;
			}
		}
		
		int pivotIndex = si + count;
		// swap p with a[count] index
		int temp = a[pivotIndex];
		a[pivotIndex] = a[si];
		a[si] = temp;
		
		// move arrange elements before and after pivot position in right place
		int start = si;
		int end = ei;
		
		while(start < end) {
			if(a[start] < a[pivotIndex]) {
				start++;
			}else if(a[end] >= a[pivotIndex]) {
				end--;
			}else {
				// swap them
				int tempVar = a[end];
				a[end] = a[start];
				a[start] = tempVar;
				start++;
				end--;
			}
		}
		return pivotIndex;
	}
	
	public static void QS(int[] a, int si, int ei) {
		// base case
		if(si >= ei) {
			return;
		}
		
		int pivotIndex = partition(a,si,ei);
		QS(a,si,pivotIndex-1);
		QS(a,pivotIndex+1,ei);
	}
	
	public static void printArr(int[] a) {
		for(int x: a) {
			System.out.print(x + " ");
		}
	}

	public static void main(String[] args) {
		int[] a = {2,39,9,5,66,4,32,6,4};
		printArr(a);
		System.out.println();
		QS(a,0,a.length-1);
		printArr(a);
	}

}
