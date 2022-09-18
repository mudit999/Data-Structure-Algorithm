package dynamicProgramming;

import java.util.Scanner;

public class StairCase {
	
	public static long stairCaseIterative(int n) {
		// base
		if(n == 0) {
			return 1;
		}
		
		if(n == 1 || n == 2){
            return n;
        }
		
		if(n == 3) {
			return 4;
		}
		
		int[] dp = new int[n+1];
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for(int i = 4 ; i<=n ;i++) {
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		}
		return dp[n];

	}

	public static int stairCaseDP(int n, int[] dp) {
		// base
		if(n == 0) {
			return 1;
		}
		
		if(n == 1 || n == 2){
            return n;
        }
		
		if(n == 3) {
			return 4;
		}
		
		int ans1, ans2, ans3;
		
		// check if dp array contains value or not
		if(dp[n-1] == -1) {
			// get value
			ans1 = stairCaseDP(n-1, dp);
			// update value
			dp[n-1] = ans1;
		}else {
			ans1 = dp[n-1]; 
		}
		
		if(dp[n-2] == -1) {
			// get value
			ans2 = stairCaseDP(n-2, dp);
			// update value
			dp[n-2] = ans2;
		}else {
			ans2 = dp[n-2]; 
		}
		
		if(dp[n-3] == -1) {
			// get value
			ans3 = stairCaseDP(n-3,dp);
			// update value
			dp[n-3] = ans3;
		}else {
			ans3 = dp[n-3]; 
		}
		
		return ans1+ans2+ans3;
	}
	
	public static int stairCase(int n) {
        // edge case
        if(n == 0){
            return 1;
        }
        
        // base case
		if(n == 1 || n == 2){
            return n;
        }
		
		if(n == 3) {
			return 4;
		}
		
		int ans1 = stairCase(n-1);
		int ans2 = stairCase(n-2);
		int ans3 = stairCase(n-3);
		return ans1 + ans2 + ans3;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] dp = new int[n+1];
		for(int i = 0 ; i<dp.length; i++) {
			dp[i] = -1;
		}	
		int ans = stairCaseDP(n, dp);
		
		System.out.println("WithDP: ");
		System.out.println(ans);
		System.out.println();
		
		System.out.println("WithDPIterative: ");
		long idp = stairCaseIterative(n);
		System.out.println(idp);
		System.out.println();

		
		System.out.println("WithoutDP: ");
		System.out.println(stairCase(n));
		
		int a = 3;
		long b = 1;
		System.out.println(a-b);
	}
}