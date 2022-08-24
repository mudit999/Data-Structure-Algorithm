package twoDimensionArray;

public class HighestColSum {

	
	public static void findIt(int[][] mat) {
		if(mat.length == 0) {
			return;
		}
		
		int rows = mat.length;
		int cols = mat[0].length;
		
		int maxColSum = Integer.MIN_VALUE; 
		
		for(int j = 0 ;j<cols; j++) {
			int colSum = 0;
			for(int i = 0; i<rows; i++) {
				colSum += mat[i][j];
			}
			if(colSum > maxColSum) {
				maxColSum = colSum;
			}
		}
		
		int maxRowSum = Integer.MIN_VALUE; 
				
		for(int i = 0 ;i<rows; i++) {
			int rowSum = 0;
			for(int j = 0; j<cols; j++) {
				rowSum += mat[i][j];
			}
			if(rowSum > maxRowSum) {
				maxRowSum = rowSum;
			}
		}
		
		if(maxColSum > maxRowSum) {
			System.out.println("Column " + maxColSum);
		}else {
			System.out.println("Row " + maxRowSum);
		}
		
	}
	
	public static void main(String[] args) {
//		int[][] mat = {{3,4,9}, {7,4,3},{0,3,4},{2,7,6}};
//		int[][] mat = {{2},{7},{9}};
		int[][] mat = {{2,2},{2,2}};

		findIt(mat);
	}

}
