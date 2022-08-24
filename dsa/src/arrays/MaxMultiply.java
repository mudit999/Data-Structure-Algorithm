package arrays;

public class MaxMultiply {
	
	public static long maximumMultiple(int N, int[] A) {
        // code here
        int B[] = new int[N/2];
        
        int i = 0;
        int j = A.length-1;
        
        int z = 0;
        while(i<j){
            int prod = A[i]*A[j];
            B[z] = prod;
            i++;
            j--;
            z++;
        }
        
        
        int max = Integer.MIN_VALUE;
        
        for(int iterator = 0; iterator<B.length; iterator++){
            if(max < B[iterator]){
                max = B[iterator];
            }
        }
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-12,17,-13,17};
		System.out.println(maximumMultiple(4,arr));
	}

}
