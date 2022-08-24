package recursionPractice;

public class StringInteger {
	
	public static int convertStringToInt(String s){
		int strLen = s.length();
		if(strLen == 0) {
			return -34343894;
		}
		
		// base case
        if(strLen == 1){
        	return s.charAt(0) - '0';
        }
        
        // IH
        int secondPart = convertStringToInt(s.substring(1));
        
        // IS
        int firstPart = s.charAt(0) - '0';
        return (firstPart * (int)(Math.pow(10,strLen-1))) + secondPart;
	}

	public static void main(String[] args) {
		System.out.println(convertStringToInt("23232"));
	}
}