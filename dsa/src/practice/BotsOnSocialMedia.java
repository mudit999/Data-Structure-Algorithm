package practice;

import java.util.HashSet;

public class BotsOnSocialMedia {

	public static int solve(int N, String S) {
        // code here
        int botCount = 0;
        HashSet<Character> set = new HashSet<>();
        
        for(int i = 0; i<S.length(); i++){
            set.add(S.charAt(i));
            if(i%2==0 && isPrime(set.size())){
                botCount++;
            }
        }
        return botCount;
    }
    
    public static boolean isPrime(int n){
        boolean status = true;
        if(n <= 1){
            status = false;
            return status;
        }
        
        int sqN = (int)Math.sqrt(n);
        for(int i = 2; i<=sqN; i++){
            if(n%i == 0){
                status = false;
                break;
            }
            status = true;
        }
        return status;
    }
	
	public static void main(String[] args) {
		String S = "aagnvd";
		System.out.println(solve(S.length(), S));
	}
}