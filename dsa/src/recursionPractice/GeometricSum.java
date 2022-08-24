package recursionPractice;

public class GeometricSum {

	public static float findGeometricSum(int k){
        // base
        if(k == 0){
            return 1;
        }
        
        float smallOutput = findGeometricSum(k-1);
        float Output = smallOutput + (float)(1 / (Math.pow(2,k)));
        return Output;
	}
	
	public static void main(String[] args) {
		System.out.println(findGeometricSum(3));
	}

}
