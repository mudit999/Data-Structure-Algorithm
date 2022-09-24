package weeklyProblems;

import java.util.Arrays;

public class Week1 {
	
	public static void printArray(int[] arr) {
		for(int i = 0 ; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void reverseArrayInplace(int[] arr) {
//		Time complexity - O(n)
//		Space complexity - O(1)
		
		if(arr.length == 1) {
			return;
		}
		
		int start = 0;
		int end = arr.length-1;
		
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	public static int[] reverseArray(int[] arr) {
		// if extra space allowed
		
//		Time complexity - O(n)
//		Space complexity - O(n)
		
		if(arr.length == 1) {
			return new int[] {arr[0]};
		}
		
		int[] reversedArr = new int[arr.length];
		
		int revIndex = 0;
		
		// iterate through original array
		for(int i = arr.length-1; i>=0; i--) {
			reversedArr[revIndex] = arr[i];
			revIndex++;
		}
		
		return reversedArr;
	}

	public static void minMax(int[] arr) {
//		Que 1: If array is sorted or not?
//		Yes
//		Ascending or descending?
		
		// default values
		int minEle = Integer.MAX_VALUE;
		int maxEle = Integer.MIN_VALUE;
		
//		// if ascending
//		if(arr.length != 0) {
//			minEle = arr[0];
//			maxEle = arr[arr.length-1];
//		}
//		System.out.println("Min: " + minEle + " Max: " + maxEle);
		
		// if descending
//		if(arr.length != 0) {
//			minEle = arr[arr.length-1];
//			maxEle = arr[0];
//		}
//		System.out.println("Min: " + minEle + " Max: " + maxEle);
		
//		// if both - sometimes asc,or desc
//		if(arr.length != 0) {
//			if(arr[0] > arr[arr.length-1]) {
//				// that means desc
//				minEle = arr[arr.length-1];
//				maxEle = arr[0];
//			}else {
//				minEle = arr[0];
//				maxEle = arr[arr.length-1];
//			}
//		}
//		System.out.println("Min: " + minEle + " Max: " + maxEle);
		
		//---------------------------------
		// Now if array is not sorted
		// Way 1
//		for(int i = 0 ; i<arr.length; i++) {
//			if(arr[i] < minEle) {
//				minEle = arr[i];
//			}
//		}
//		
//		for(int i = 0 ; i<arr.length; i++) {
//			if(arr[i] > maxEle) {
//				maxEle = arr[i];
//			}
//		}
//		
//		System.out.println("Min: "  + minEle + " Max: " + maxEle);
		
		// Way 2
		// Sort the array
		Arrays.sort(arr);
		
		if(arr.length != 0) {
			minEle = arr[0];
			maxEle = arr[arr.length-1];
		}
		
		System.out.println("Min: " + minEle + " Max: " + maxEle);
	}
	
	public static void main(String[] args) {
		
		//----------QUESTION 1 - FIND MIN AND MAX IN ARRAY------------
		
		// Time Complexity: O(1)
		// Space Complexity: O(1)

		// if ascending
		
		// Test Cases
//		int[] arr = {2,3,5,7,8,99,239};
//		int[] arr = {3,3,3,3,3,3,3,3};
//		int[] arr = {};
//		int[] arr = {-100,-30,-20,-10,-1};
//		int[] arr = {-10,20};
		
		// if descending
		
//		int[] arr = {200,32,5,1};
//		int[] arr = {3,3,3,3,3,3,3,3};
//		int[] arr = {};
//		int[] arr = {-1, -10, -100};
//		int[] arr = {20,-10};
		
		//-------------------------------
		// if not sorted
		
		// WAY 1
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		
//		int[] arr = {3,5,2,5,3,4,6,7,8};
//		int[] arr = {};
//		int[] arr = {-100,-1,-30};
		
		
		// WAY 2
		
		// (if we are allowed to change the original array)
		// if sort algo used to sort - Array.sort(arr) - O(logn)

		// Time Complexity: O(nlogn)
		// Space Complexity: O(1)
		System.out.println("Que 1 Min Max" + "\n");
		int[] arr = {3,5,2,5,3,4,6,7,8};	
		printArray(arr);
		minMax(arr);
		System.out.println();
		
		//----------QUESTION 2 - REVERSE AN ARRAY------------
		
		// Test cases
//		int[] originalArray = {1,5,8,9,3,9};
		int[] originalArray = {1,5,8,9,3};
//		int[] originalArray = {4};
//		int[] originalArray = {};

		System.out.println("Que 2 Reverse Array" + "\n");
		
//		int[] revArray = reverseArray(originalArray);
		printArray(originalArray);
//		printArray(revArray);
		
		reverseArrayInplace(originalArray);
		printArray(originalArray);
		
		}
}