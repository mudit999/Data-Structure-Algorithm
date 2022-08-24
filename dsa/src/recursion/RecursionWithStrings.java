package recursion;

public class RecursionWithStrings {

	public static String replaceChar(String s, char a, char b) {
		 if(s.length() == 0) {
			 return s;
		 }
		 
		 String smallOutput = replaceChar(s.substring(1),a,b);
		 
		 if(s.charAt(0) == a) {
			 return b + smallOutput;
		 }else {
			 return s.charAt(0) + smallOutput;
		 }
		 
	}
	
	public static String replacePi(String s) {
		if(s.length() <= 1) {
			return s;
		}
		
		if(s.charAt(0) == 'p' && s.charAt(1) == 'i'){
			String smallOutput = replacePi(s.substring(2));
			return "3.14" + smallOutput;
		}else {
			String smallOutput = replacePi(s.substring(1));
			return s.charAt(0) + smallOutput;
		}
	}
	
	public static void main(String[] args) {
//		String s = "avcxyysxyxyx";
//		System.out.println(replaceChar(s,'x','y'));
		
		String s = "fdjnvfvpidnvcjdnvcpi";
		System.out.println(replacePi(s));
	}
}