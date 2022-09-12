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
	
	public static void factorial2(int n) {
		
	}
	
	public static void main(String[] args) {
		factorial(5);
	}
}
