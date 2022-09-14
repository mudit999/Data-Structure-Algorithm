package backtracking;

public class RatInAMazeAllPossiblePath {

	public static void solveMazeAllPossiblePath(int maze[][], int path[][], int i, int j) {
		// check if cell is valid or not
		int n = maze.length;
		if(i < 0 || i >= n || j < 0 || j>= n || maze[i][j] == 0 || path[i][j] == 1) {
			return;
		}
		
		// include cell in current path
		path[i][j] = 1;
		
		// base - Destination cell
		if(i == n - 1 && j == n - 1) {	
			for(int r = 0; r<n; r++) {
				for(int c = 0 ; c<n; c++) {
					System.out.print(path[r][c] + " ");
				}
//				System.out.println();
			}
			
			System.out.println();

			path[i][j] = 0; 
			return;
		}
		
		// Top
		solveMazeAllPossiblePath(maze, path, i-1, j);
		
		// Right
		solveMazeAllPossiblePath(maze, path, i, j+1);
		
		// Down
		solveMazeAllPossiblePath(maze, path, i+1, j);
		
		// Left
		solveMazeAllPossiblePath(maze, path, i, j-1);
		
		// while returning, set it to 0
		path[i][j] = 0; 
	}	
	
	public static void ratInAMaze(int[][] maze) {
		int n =  maze.length;
		int[][] path = new int[n][n];
		solveMazeAllPossiblePath(maze, path, 0,0);
	}
	
	public static void main(String[] args) {
		int[][] maze = {{1,1,0},{1,1,0},{1,1,1}};
		ratInAMaze(maze);
	}

}