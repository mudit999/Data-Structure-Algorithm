package stringsInJava;

public class ReverseString {

	public static String reverseString(String str) {
		String newString = "";
		if(str.length() == 0) {
			return newString;
		}
		
		for(int charIndex = str.length()-1; charIndex>=0;charIndex--) {
			newString += str.charAt(charIndex);
		}
		return newString;
	}
	
	public static String reverseString2(String str) {
		String newString = "";
		if(str.length() == 0) {
			return newString;
		}
		
		for(int charIndex = 0; charIndex<str.length();charIndex++) {
			newString = str.charAt(charIndex) + newString ;
		}
		return newString;
	}
	
	
	// This method is wrong because in java, string are immutable
	
	public static void reverseString3(StringBuffer str) {
		if(str.length() == 0) {
			System.out.println("");
			return;
		}
		
		int start = 0;
		int end = str.length()-1;
		
		while(start<end) {
			char startChar = str.charAt(start);
			char endChar = str.charAt(end);
			str.setCharAt(start, endChar);
			str.setCharAt(end,startChar);
			start++;
			end--;
		}
		
	}
	
	public static void main(String[] args) {
//		String str = "NitiN";
//		String ans = reverseString2(str);
//		System.out.println(str.equals(ans)); 
		
		StringBuffer str = new StringBuffer("mudit");
		reverseString3(str);
		System.out.println(str);
		
		
		char[] ss = new char[] {'d','e','w','l'};
		System.out.println(ss.length);
		
	}
}