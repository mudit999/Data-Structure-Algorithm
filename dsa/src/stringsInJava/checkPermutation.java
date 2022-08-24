package stringsInJava;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class checkPermutation {
	
	public static boolean isPermutation(String str1, String str2) {
	    // Write your code here
        // HashMap
        
        
        if(str1.length() == 0 && str2.length() == 0){
            return true;
        }
        
        if(str1.length() != str2.length()){
            return false;
        }
        
        Map<Character,Integer> map = new HashMap<>();
        
        for(int i = 0; i<str1.length(); i++){
            if(map.containsKey(str1.charAt(i))){
                map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);
            }else{
        		map.put(str1.charAt(i), 1);
            }
        }
        
        for(int i = 0 ; i<str2.length();i++){
            if(map.containsKey(str2.charAt(i))){
                map.put(str2.charAt(i), map.get(str2.charAt(i))-1);
            }else{
                return false;
            }
        }
        
        Set<Character> keys = map.keySet();
        
        for(char key : keys){
            if(map.get(key) != 0){
                return false;
            }
        }
        return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "abcc";
		String str2 = "cabd";
		boolean ans = isPermutation(str1,str2);
		System.out.println(ans);

	}

}
