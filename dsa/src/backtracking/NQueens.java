package backtracking;

public class NQueens {

	public static boolean placeNQueens(int n) {
		int board[][] = new int[n][n];
		return placeQueens(n, 0, board);
	}

	// Study Ref - https://youtu.be/MHXR4PCY8c0
	public static boolean placeQueens(int n, int row, int[][] board) {
		// base
		if(row == n) {
			// valid board configuration
			for(int r = 0 ; r < n ; r++) {
				for(int c = 0 ; c< n; c++) {
					System.out.print(board[r][c]);
				}
				System.out.println();
			}
			
			return true;
		}

		// Check for all columns
		for(int col = 0 ; col < n; col++) {
			// Check if its safe to place Queens
			if(isSafe(board, row, col, n)){
				// if it is safe then place the queens and move to next row
				board[row][col] = 1;
				if(placeQueens(n, row+1, board)) {
					return true;
				}else {
					// in case of false - > backtracks, Imp step
					board[row][col] = 0;
				}
			}
		}
		return false;
	}

	// i - row, j - column
	// Study Ref - https://youtu.be/jFwREev_yvU?t=768
	public static boolean isSafe(int[][] board, int i, int j, int n) {

		// check for the upper column
		// top to down check -> row = (0 to n-1) inclusive both
		int x = 0;
		int y = j;
		
		while(x < n) {
			if(board[x][y] == 1) {
				return false;
			}
			x++;
		}

		// check for the upper Left Diagonal
		x = i;
		y = j;

		while(x >=0 && y >= 0) {
			if(board[x][y] == 1) {
				return false;
			}
			x--;
			y--;
		}
		
		//check for upper right diagonal 
		x = i; 
		y = j;
		
		while(x >= 0 && y < n) {
			if(board[x][y] == 1) {
				return false;
			}
			x--;
			y++;
		}
		
		return true;

	}

	public static void main(String[] args) {
		System.out.println(placeNQueens(4));
	}

}