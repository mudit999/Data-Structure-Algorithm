package recursion;

public class binarySearch {

	public static int bSearch(int[] a, int si, int ei, int x) {
		
		// base
		if(si > ei) {
			return -1;
		}
		
		int midIndex = (si+ei)/2;
		if(a[midIndex] == x) {
			return midIndex;
		}else if(a[midIndex] < x){
			return bSearch(a,midIndex+1,ei,x);
		}else {
			return bSearch(a,si,midIndex-1,x);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,4,6,9,11,15};
		System.out.println(bSearch(a, 0, a.length-1, 150));

	}

}
