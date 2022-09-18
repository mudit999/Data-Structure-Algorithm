package dynamicProgramming;

import java.util.Scanner;

public class MinStepsToOne {
	
	public static int minStepToOne(int num) {
		
		// base
		if(num == 1) {
			return 0;
		}
				
		// I was initializing with 0 in ans1 and ans2
//		min(def,infinity, infinity)
		int ans1 = minStepToOne(num-1);
		int ans2 = Integer.MAX_VALUE;
		if((num%2) == 0) {
			ans2 = minStepToOne(num/2);
		}
		int ans3 = Integer.MAX_VALUE;
		if((num%3) == 0) {
			ans3 = minStepToOne(num/3);
		}
		
		return Math.min(ans1, Math.min(ans2, ans3)) + 1;
		
	}
	
	// Getting wrong answer
	
//	public static int minStepToOneDpIterative(int n) {
//		if(n == 1) {
//			return 0;
//		}
//		
//		int[] dp = new int[n+1];
//		dp[1] = 0;
//		
//		int ans1, ans2 = Integer.MAX_VALUE, ans3 = Integer.MAX_VALUE;
//		
//		for(int i = 2 ; i <= n;i++) {
//			
//			ans1 = dp[i-1];
//			
//			if(i%2 == 0) {
//				ans2 = dp[i/2];
//			}
//			
//			if(i%3 == 0) {
//				ans3 = dp[i/3];
//			}
//			
//			int ans = Math.min(ans1, Math.min(ans2, ans3)) + 1;
//			dp[i] = ans;
//		}
//		return dp[n];
//	}

	// DP
	public static int minStepToOneDp(int n, int[] dp) {
		if(n == 1) {
			return 0;
		}
		
		int ans1;
		if(dp[n-1] == -1) {
			ans1 = minStepToOneDp(n-1,dp);
			dp[n-1] = ans1;
		}else {
			ans1 = dp[n-1];
		}
		
		int ans2 = Integer.MAX_VALUE;
		if((n%2) == 0) {
			if(dp[n/2] == -1) {
				ans2 = minStepToOneDp(n/2,dp);
				dp[n/2] = ans2;
			}else {
				ans2 = dp[n/2];
			}
		}
		
		int ans3 = Integer.MAX_VALUE;
		if((n%3) == 0) {
			if(dp[n/3] == -1) {
				ans3 = minStepToOneDp(n/3,dp);
				dp[n/3] = ans3;
			}else {
				ans3 = dp[n/3];
			}
		}
		
		return Math.min(ans1, Math.min(ans2, ans3)) + 1;
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
		System.out.println(minStepToOneDp(n, dp));
		System.out.println();
		
//		----------------------------------------------
		
		System.out.println("Recursive ans: ");
		System.out.println(minStepToOne(n));
//		System.out.println();
		
//		System.out.println("Iterative DP ans: ");
//		System.out.println(minStepToOneDpIterative(n));
	}

}
