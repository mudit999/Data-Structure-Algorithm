package recursionThree;

import java.util.HashMap;

public class PrintKeypad {
	
    // Declaring the static map
    private static HashMap<Integer, String> map;
    
    // Instantiating the static map
    static
    {
        map = new HashMap<>();
		map.put(2, "abc");
		map.put(3, "def");
		map.put(4, "ghi");
		map.put(5, "jkl");
		map.put(6, "mno");
		map.put(7, "pqrs");
		map.put(8, "tuv");
		map.put(9, "wxyz");
    }

	public static void printKeypad(int input, String stringSoFar) {
		// base case
		if(input == 0) {
			System.out.println(stringSoFar);
			return;
		}
		
		int lastDigit = input%10;
		int smallInput = input/10;
		String optionsforLastDigit = map.get(lastDigit);
		
		for(int i = 0; i<optionsforLastDigit.length(); i++) {
			printKeypad(smallInput,optionsforLastDigit.charAt(i) + stringSoFar);
		}
	}
	
	public static void main(String[] args) {
		String stringSoFar = "";
		printKeypad(27, stringSoFar);
	}

}
