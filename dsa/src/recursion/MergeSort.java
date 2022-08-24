package recursion;

public class MergeSort {

	public static void merge(int[] L1,int[] L2,int[] a) {
		int i =  0;
		int j = 0;
		
		int aIndex = 0;
		while(i != L1.length && j != L2.length) {
			if(L1[i] <= L2[j]) {
				a[aIndex] = L1[i];
				i++;
			}else{
				a[aIndex] = L2[j];
				j++;
			}
			aIndex++;
		}
		
		while(i<L1.length) {
			a[aIndex] = L1[i];
			i++;
			aIndex++;
		}
		
		while(j<L2.length) {
			a[aIndex] = L2[j];
			j++;
			aIndex++;
		}
	}
	
	public static void ms(int[] a) {
		
		//Base
		if(a.length <= 1) {
			return;
		}
		
		// IS
		int mid = a.length/2;
		int L1[];
		int L2[];
		
		if(a.length%2 == 0) {
			L1 = new int[mid];
			L2 = new int[mid];
		}else {
			L1 = new int[mid];
			L2 = new int[mid+1];
		}
		
		// copy elements
		for(int i = 0; i<mid; i++) {
			L1[i] = a[i];
		}
		
		int j =  0;
		for(int i = mid;i<a.length;i++) {
			L2[j] = a[i];
			j++;
		}
		
		// IH
		ms(L1);
		ms(L2);
		
		// Now merge sorted L1 and L2 into a
		merge(L1,L2,a);
	}
	
	public static void printArr(int[] a) {
		for(int x: a) {
			System.out.print(x + " ");
		}
	}
	
	public static void main(String[] args) {
		int a[] = {3,2,1,4,5,4,21,345,3};
		printArr(a);
		ms(a);
		System.out.println();
		printArr(a);
	}

}
