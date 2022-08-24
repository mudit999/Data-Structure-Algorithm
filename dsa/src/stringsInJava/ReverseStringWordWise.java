package stringsInJava;

public class ReverseStringWordWise {

	public static void main(String[] args) {
		int start = 0;
		String str = "mudit is awesome";
		String ans = "";
		int i = 0;
		for(;i<str.length();i++) {
			if(str.charAt(i) == ' ') {
				int end = i-1;
				String temp = "";
				
				// reverse the word
				for(int j = end ; j>=start; j--) {
					temp += str.charAt(j);
				}
				
				// Add it to ans string
				ans += temp + " ";
				start = i+1;
			}
		}
		
		int end = i-1;
		String temp = "";
		
		// reverse the word
		for(int j = end ; j>=start; j--) {
			temp += str.charAt(j);
		}
		
		// Add it to ans string
		ans += temp;
		
		// Print the ans
		System.out.println(ans);
	}

}
