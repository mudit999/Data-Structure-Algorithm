package recursionThree;

import java.util.HashMap;

public class ReturnKeypad {
	
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
	
	public static String[] returnKeypad(int input) {
		// base case
		if(input == 0) {
			return new String[] {""};
		}
		
		String[] smallOutput = returnKeypad(input/10);
		int lastDigit = input%10;
		
		String mapResponse = map.get(lastDigit);
		
		String[] output = new String[smallOutput.length * mapResponse.length()];
		
		int indexForOutput = 0;
		// for loop to access characters of mapResponse String, Eg:4 - ghi
		for(int i = 0 ; i<mapResponse.length(); i++) {
			char c = mapResponse.charAt(i);
			
			// for loop for smallOutput Array
			for(int j = 0 ; j < smallOutput.length; j++) {
				output[indexForOutput] = smallOutput[j] + c;
				indexForOutput++;
			}
		}
		
		return output;
	}
	
	public static void main(String[] args) {
		int input = 23;
	
		// or create a static HashMap
//		HashMap<Integer, String> map = new HashMap<>();
//		map.put(2, "abc");
//		map.put(3, "def");
//		map.put(4, "ghi");
//		map.put(5, "jkl");
//		map.put(6, "mno");
//		map.put(7, "pqrs");
//		map.put(8, "tuv");
//		map.put(9, "wxyz");
		
		String[] output = returnKeypad(input);
		for(String item : output) {
			System.out.println(item);
		}
		
		System.out.println();
		System.out.println(output.length);
	}
}