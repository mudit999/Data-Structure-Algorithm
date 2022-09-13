package recursionThree;

public class PrintSubsequences {

	public static int count = 0;
	
	public static void printSubsequences(String input, String stringSoFar) {
		// base case
		if(input.length() == 0) {
			System.out.println(stringSoFar);
			count++;
			return;
		}
		
		String smallInput = input.substring(1);
		// decision - to not include character firstChar of input
		printSubsequences(smallInput, stringSoFar);
		// decision - to include characterfirstChar of i nput
		printSubsequences(smallInput, stringSoFar + input.charAt(0));
	}
	
	public static void main(String[] args) {
		String input = "abc";
		String stringSoFar = "";
		printSubsequences(input, stringSoFar);
		System.out.println(count);
	}
}