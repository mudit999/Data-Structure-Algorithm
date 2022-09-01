package stringInJava;

public class MinLength {

	public static void minLen(String[] strs) {
		int min = Integer.MAX_VALUE;
		int minLenStringIndex = -1;
		
		for(int i = 0; i<strs.length; i++) {
			int len = strs[i].length();
			if(len < min) {
				min = len;
				minLenStringIndex = i;
				System.out.println(min + " " + minLenStringIndex);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] chaf = {"apple", "apps", "awesome"};
//		minLen(chaf);
		
		System.out.println('a' + "" + 9);
	}

}
