package pramp;

// Question : https://www.pramp.com/challenge/jKoA5GAVy9Sr9jGBjz04

public class ArrIndexArrEquality {
	
	public static int ans(int[] arr) {
		int left = 0;
	    int right = arr.length - 1;
	    
	    while(left < right){
	      int mid = (left + right)/2;
	      int num = arr[mid];
	      
	      if(num - mid >= 0){ // check this line: num - its index
	        right = mid;
	      }else{
	        left = mid + 1;
	      }
	      
	      if(arr[left] - left == 0){
	        return arr[left];
	      } 
	    }
	    return -1;
	}
	
	public static void main(String[] args) {
		int Arr[] = {-8,0,2,5};
		System.out.println(ans(Arr));
	}
}
