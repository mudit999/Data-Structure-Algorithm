package recursionThree;

public class MinimumInArray {

	public static int findMin(int[] input, int startIndex) {
		// base
		if(startIndex == input.length) {
			return Integer.MAX_VALUE;
		}
		
		int minInSmallArrayScope =  findMin(input, startIndex + 1);
		if(input[startIndex] < minInSmallArrayScope) {
			return input[startIndex];
		}else {
			return minInSmallArrayScope;
		}
	}
	
	public static void printMin(int[] input, int startIndex, int minSoFar) {
		// base
		if(startIndex == input.length) {
			System.out.println(minSoFar);
			return;
		}
		
		int newMinimum = minSoFar;
		if(input[startIndex] < minSoFar) {
			newMinimum = input[startIndex];
		}
		printMin(input, startIndex+1, newMinimum);
		
	}
	
	public static void main(String[] args) {
		int input[] = {3,4,1,90,4 };
//		int startIndex = 0;
//		int ans = findMin(input, startIndex);
//		System.out.println(ans);
		
		printMin(input, 0, Integer.MAX_VALUE);
	}



}
