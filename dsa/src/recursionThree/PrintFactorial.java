package recursionThree;

public class PrintFactorial {
	
	public static int factorialHelper(int n) {
		if(n == 1 || n == 0) {
			return 1;
		}
		
		return n * factorialHelper(n-1);
	}
	
	public static void factorial(int n) {
		int ans = factorialHelper(n);
		System.out.println(ans);
	}
	
	public static void factorial2(int input, int answer) {
		// base case
		if(input == 0) {
			System.out.println(answer);
			return;
		}
		
		answer = answer * input;
		factorial2(input - 1, answer);
	}
	
	public static void main(String[] args) {
//		factorial(5);
		// initial value of ans = 1
		factorial2(5, 1);
	}
}
