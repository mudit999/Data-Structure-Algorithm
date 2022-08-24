package arrays;

import java.util.Arrays;

public class MovesZeros {

	public static int[] moveZeros(int[] arr) {
		int newArr[] = new int[arr.length];
		
		int z = 0;
		
		for(int i = 0 ; i<arr.length; i++) {
			if(arr[i] != 0) {
				newArr[z] = arr[i];
				z++;
			}
		}
		return newArr;
	}
	
	
	public static int[] moveZeros2(int[] arr) {
		int i = 0;
		for(int j = 0 ;j<arr.length;j++) {
			if(arr[j] != 0) {
				arr[i] = arr[j];
				i++;
			}
		}
		
		while(i<arr.length) {
			arr[i] = 0;
			i++;
		}
		
		return arr;
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {0,1,0,3,1,2};
//		int newArr[] = moveZeros(arr);
		//int newArr2[]= moveZeros2(arr);
		//printArray(newArr2);
		
		int newA[] = Arrays.copyOfRange(arr, 0, 1);
		printArray(newA);
	}

}
