package dynamicProgramming;

import java.util.Scanner;

public class Fibonacci {
	
	public static int fibIterative(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		
		// n>=2
		for(int i = 2; i<=n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[n];
	}

	public static int fib(int n, int[] dp) {
		// base case
		if(n == 0 || n == 1) {
			return n;
		}
		
		int ans1, ans2;
		
		if(dp[n-1] == -1) {
			// cal ans1
			ans1 = fib(n-1, dp);
			
			// store it in array
			dp[n-1] = ans1;
		}else {
			//get ans1
			ans1 = dp[n-1];
		}
		
		if(dp[n-2] == -1) {
			ans2 = fib(n-2, dp);
			dp[n-2] = ans2;
		}else {
			ans2 = dp[n-2];
		}
		
		int finalAns = ans1 + ans2;
		return finalAns;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		// array to store recursion call results
		int[] dp = new int[n+1];
		
		// initialize whole array with -1
		for(int i = 0; i<dp.length; i++) {
			dp[i] = -1;
		}
		
		System.out.println("Recursive DP ans: ");
		System.out.println(fib(n, dp));
		System.out.println();
		
		int fibIAns = fibIterative(n);
		System.out.println("Iterative DP ans: ");
		System.out.println(fibIAns);
	}

}