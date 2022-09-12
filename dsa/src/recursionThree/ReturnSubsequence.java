package recursionThree;

public class ReturnSubsequence {

	public static String[] printSubSequence(String input) {
		// base case
		if(input.length() == 0) {
			String[] output = new String[1];
			output[0] = "";
			return output;
			// or return new String[] {""};
		}

		// IH
		char firstChar = input.charAt(0);
		String[] smallOutput = printSubSequence(input.substring(1));

		// IS
		String[] output = new String[2*smallOutput.length];
		int i = 0;
		for(; i< smallOutput.length; i++) {
			output[i] = smallOutput[i];
		}

		int index = i;
		for(int j = 0 ; j<smallOutput.length; j++) {
			output[index] = firstChar + smallOutput[j];
			index++;
		}
		return output;
	}

	public static void main(String[] args) {
		String input = "abc";
		String[] ansArr = printSubSequence(input);

		for(String item :ansArr) {
			System.out.println(item);
		}
		
		System.out.println();
		System.out.println("Total subsequences - " + ansArr.length);
	}
}
