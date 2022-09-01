package array;

public class Sort012 {
	
	public static void sortZeroOneTwo(int[] arr) {
		int i = 0;
		int nz = 0;
		int nt = arr.length-1;
		
		while(i<=nt) {
			if(arr[i] == 1) {
				i++;
			}else if(arr[i] == 0) {
				int temp = arr[nz];
				arr[nz] = arr[i];
				arr[i] = temp;
				nz++;
				i++;
			}else{
				int temp = arr[i];
				arr[i] = arr[nt];
				arr[nt] = temp;
				nt--;
			}
		}
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = {1,0,2,1,0,1,2,0};
		printArray(arr);
		System.out.println();
		sortZeroOneTwo(arr);
		printArray(arr);

	}

}
