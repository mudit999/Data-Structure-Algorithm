package recursion;

public class RecursoinBasics2 {

	
	public static int firstIndex(int[] a,int x) {
		if(a.length == 0) {
			return -1;
		}
		
		if(a[0] == x) {
			return 0;
		}
		
		int[] smallArray = new int[a.length-1];
		
		for(int i = 1; i<a.length; i++) {
			smallArray[i-1] = a[i];
		}
		
		int fi = firstIndex(smallArray,x);
		if(fi == -1) {
			return -1;
		}else {
			return fi+1;
		}
	}
	
	public static int firstIndexBetter(int a[], int x, int si) {
		
		if(si == a.length) {
			return -1;
		}
		
		if(a[si] == x) {
			return si;
		}
		
		int k = firstIndexBetter(a,x,si+1);
		return k;
	}
	
	
	// Last Index
	public static int lastIndex(int a[], int x) {
		if(a.length == 0) {
			return -1;
		}
		
		if(a[a.length-1] == x) {
			return a.length-1;
		}
		
		int smArr[] = new int[a.length-1];
		for(int i = 0 ; i<=a.length-2; i++) {
			smArr[i] = a[i]; 
		}
		
		int output = lastIndex(smArr,x);
		return output;
	}
	
	public static int lastIndexBetter(int a[], int x, int si) {
		if(si < 0) {
			return -1;
		}
		
		if(a[si] == x) {
			return si;
		}
		
		int output = lastIndexBetter(a,x,si-1);
		return output;
	}
	
	public static int lastIndexApproach2(int[] a, int x) {
		if(a.length == 0) {
			return -1;
		}
		
		int[] smallArray = new int[a.length-1];
		
		for(int i = 1; i<a.length; i++) {
			smallArray[i-1] = a[i];
		}
		
		int k = lastIndexApproach2(smallArray,x);
		if(k != - 1) {
			return k+1;
		}else {
			if(a[0] == x) {
				return 0;
			}else {
				return -1;
			}
		}
	}
	
	public static int lastIndexApproach2Better(int[] a, int x, int si) {
		if(si == a.length) {
			return -1;
		}
		
		int k = lastIndexApproach2Better(a,x,si+1);
		if(k != -1) {
			return k;
		}else {
			if(a[si] == x) {
				return si;
			}else {
				return -1;
			}
		}			
	}
	
	public static void main(String[] args) {
		int a[] = {1,2,8,44,3,8,33,2,1};
//		System.out.println(firstIndex(a,99));
//		System.out.println(firstIndexBetter(a,8,0));
//		System.out.println(lastIndex(a,200));
		System.out.println(lastIndexBetter(a, 8, a.length-1));
		System.out.println(lastIndexApproach2(a,8));
		System.out.println(lastIndexApproach2Better(a,8,0));
	}

}
