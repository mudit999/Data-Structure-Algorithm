package stringInJava;

public class CompressTheString {
	
    public static String getCompressedString(String str) {
    	String ans = "";
        for(int i = 0 ; i<str.length();){
            int count = 1;
            int j = i+1;
            for(;j<str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }else {
                	break;
                }
            }
            if(count == 1){
                ans += str.charAt(i);
            }else{
                ans += str.charAt(i) + "" + count;
            }
            i = j;
        }
        return ans;
    }

	public static void main(String[] args) {
		String str = "aaabcdd";
		String ans = getCompressedString(str);
		System.out.println(ans);
	}

}
