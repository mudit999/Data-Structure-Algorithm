package weeklyProblems;

// suresh solutions
// https://www.onlinegdb.com/DwosdHdwF8

import java.util.HashSet;
import java.util.Set;

public class Week2 {
	
	public static void printArray(int[] arr) {
		for(int i = 0 ; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void shuffleArray(int[] arr) {

		// si and ei are variable that stores index , remember it does not stores values at that index i.e. arr[index]
		int si = 0;
		int ei = arr.length-1;
		
		while(si < ei) {
			// if arr[i] is even
			if((arr[si] % 2) == 0) {
				si++;
			}
			
			// if arr[j] is odd
			if((arr[ei] % 2) != 0) {
				ei--;
			}
			
			// if arr[i] is odd and arr[j] is even
			if(si < ei && arr[si]%2 != 0 && arr[ei]%2 == 0) {
				// swap them
				int temp = arr[si];
				arr[si] = arr[ei];
				arr[ei] = temp;
				si++;
				ei--;
			}
		}
	}
	
//	This approach takes unnecessary time/ iterations
	
//	public static int duplicatesInArray(int[] arr) {
//		
//		for(int i = 0 ; i<arr.length; i++) {
//			int count = 1;
//			for(int j = 0 ; j<arr.length; j++) {
//				if(i == j) {
//					continue;
//				}
//				
//				if(arr[i] == arr[j]) {
//					count++;
//					return arr[i];
//				}
//			}
//		}
//		return Integer.MAX_VALUE;
//	}
	
	
	// simple approach
	public static int simpleDupFind(int[] arr) {
		for(int i = 0; i <arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;
	}
	
	// HashSet approch
	public static int findDuplicateAnyNumber(int[] input) {
		int result = -1;
		if(input == null || input.length == 0)
			return result;

		Set<Integer> setInt = new HashSet<>();
		for(int in : input) {
			if(setInt.contains(in)) {
				result = in;
				return result;
			} else {
				setInt.add(in);
			}
		}
		return result;
	}
	
	// unique approach - Try to find clue from problem statement
	public static int FindADup(int[] a) {
        int n = a.length;
        for(int i=0;i<n; i++) {
            while(a[i] != i) {
                if(a[a[i]] == a[i]) {
                    return a[i];
                }
                int t = a[a[i]];
                a[a[i]] = a[i];
                a[i] = t;
            }
        }
        return -1;
	}
	
	public static void main(String[] args) {
//		int[] arr = {3, 5, 9, 6, 2, 8, 11};
//		int[] arr = {3, 2, 8, 11};
//		int[] arr = {};
//		int[] arr = {2,4,6,8};
//		int[] arr = {1,3,7,11};
//		int[] arr = {3,3,3,3,3};
//		int[] arr = {3,5,2,9,8,11};
//		int[] arr = {4,10,2,9,7,11}; // IMP 
//
//		
//		printArray(arr);
//		shuffleArray(arr);
//		printArray(arr);
		
//		int n =7;
//		int[] arr2 = {2, 3, 1, 0, 5, 5, 0};
//		int[] arr2 = {0,1,2,3,4,5,6};
//		int[] arr2 = {};
//		
	
		int arr[] = {2,3,1,2,4};
		int ans = FindADup(arr);
		System.out.println(ans);
		
		System.out.println();
		System.out.println(simpleDupFind(arr));
	}
}

