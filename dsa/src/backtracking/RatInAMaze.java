package backtracking;

public class RatInAMaze {
	
	public static boolean solveMaze(int maze[][], int path[][], int i, int j){
		// check if cell is valid or not
		int n = maze.length;
		if(i < 0 || i >= n || j < 0 || j>= n || maze[i][j] == 0 || path[i][j] == 1) {
			return false;
		}
		
		// include cell in current path
		path[i][j] = 1;
		
		// base - Destination cell
		if(i == n - 1 && j == n - 1) {		
			return true;
		}
		
		// TOP : i-1,j
		// Right : i, j+1
		// Down : i+1, j
		// Left : i, j-1
		
		// Top
		if(solveMaze(maze, path, i-1, j)) {
			return true;
		}

		
		// Right
		if(solveMaze(maze, path, i, j+1)) {
			return true;
		}
		
		// 	Down
		if(solveMaze(maze, path, i+1, j)) {
			return true;
		}
		
		// Left
		if(solveMaze(maze, path, i, j-1)) {
			return true;
		}
		
		// after checking all possibility, if still not found - return false
		return false;
	}
		
	public static boolean ratInAMaze(int[][] maze) {
		int n =  maze.length;
		int[][] path = new int[n][n];
		return solveMaze(maze, path, 0,0);
	}
	
	
	public static void main(String[] args) {
		int[][] maze = {{1,1,0},{1,1,0},{1,1,1}};
		boolean ans = ratInAMaze(maze);
		System.out.println(ans);
	}
}
