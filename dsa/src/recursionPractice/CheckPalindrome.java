package recursionPractice;

public class CheckPalindrome {
	
	public static boolean isStringPalindromeHelper(String input, int si, int ei) {
		
        // base
		if(si >= ei) {
			return true;
		}
		
		if(input.charAt(si) != input.charAt(ei)) {
			return false;
		}
		
		boolean output = isStringPalindromeHelper(input, si+1, ei-1);
		return output;
	}

	public static void main(String[] args) {
		String ques = "racecard";
		System.out.println(isStringPalindromeHelper(ques, 0, ques.length()-1));
	}
}