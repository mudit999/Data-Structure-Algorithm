package recursion;

public class RecursionBasics {
	
	public static int fact(int n) {
		
		// base condition
		if(n == 0) {
			return 1;
		}
		
		int smallOutput = fact(n-1);
		int output = n * smallOutput;
		return output;
	}
	
	
	public static int sumNNaturalNumber(int n) {
		
		// base case
		if(n == 0) {
			return 0;
		}
		
		// Induction Hypothesis
		int smallerOutput = sumNNaturalNumber(n-1);
		
		// Induction Step
		int output = n +  smallerOutput;
		return output;
		
	}
	
	public static int calPower(int base, int power) {
		if(power == 0) {
			return 1;
		}
		
		int smallerOutput = calPower(base,power-1);
		int output = base * smallerOutput;
		return output;
	}
	
	
	public static void print1toN(int n) {
		if(n == 0) {
			return;
		}
		
		print1toN(n-1);
		System.out.println(n);
	}
	
	
	public static int fibonacciSeries(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		
		int fib_n_1 = fibonacciSeries(n-1);
		int fib_n_2 = fibonacciSeries(n-2);
		int output = fib_n_1 + fib_n_2;
		return output;
	}
	
	
	public static int numOfDigits(int n) {
		// Base case
		if(n == 0) {
			return 0;
		}
		
		// IH
		int smallOutput = numOfDigits(n/10);
		
		// IS
		int output = smallOutput + 1;
		return output;	
	}
	
	public static boolean isBetterArraySorted(int[] arr, int si) {
		if(si == arr.length-1) {
			return true;
		}
		
		if(arr[si] > arr[si+1]) {
			return false;
		}
		
		boolean smallArrSorted = isBetterArraySorted(arr,si+1);
		return smallArrSorted;
	}
	
	
	public static int findIndexOfNum(int[] a, int si, int x) {
		if(si == a.length-1){
            if(a[si] == x){
                return si;
            }else{
                return -1;
            }
        }
            
        int smallOutput = findIndexOfNum(a, si+1,x);
        return smallOutput;
	}
	

	
	public static void main(String[] args) {
		
		int[] Arr = {9,8,10,9};
//		System.out.println(fact(1));
//		System.out.println(sumNNaturalNumber(10));
//		System.out.println(calPower(2,5));
//		print1toN(5);
//		System.out.println(fibonacciSeries(6));
//		System.out.println(numOfDigits(2));
//		boolean ans = isBetterArraySorted(Arr,0);
//		System.out.println(findIndexOfNum(Arr,0,8));
//		System.out.println(ans);
		
	}
}