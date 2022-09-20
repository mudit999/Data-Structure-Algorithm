package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph {

	public static void dfTraversalHelper(int[][] adjMatrix, int currentVertex, boolean[] visited) {
		visited[currentVertex] = true;
		System.out.print(currentVertex + " ");

		for(int j = 0 ; j < adjMatrix.length; j++) {
			if(adjMatrix[currentVertex][j] == 1 && visited[j] == false) {
				// j is unexplored neighbour of currentVertex 
				dfTraversalHelper(adjMatrix, j, visited);
			}
		}

	}

	// Recursive code - DFT
	public static void dfTraversal(int[][] adjMatrix) {
		int source = 0;
		boolean[] visited = new boolean[adjMatrix.length]; 
		dfTraversalHelper(adjMatrix, source, visited);
	}
	
	// Iterative code - BFT
	public static void bfTraversal(int[][] adjMatrix) {
		Queue<Integer> pendingVertices = new LinkedList<Integer>();
		boolean[] visited = new boolean[adjMatrix.length];
		// marking 0 as visited and putting it in queue 
		visited[0] = true;
		pendingVertices.add(0);
		
		// till queue get empty, get front of queue, print it
		while(!pendingVertices.isEmpty()) {
			int currentVertex = pendingVertices.poll();
			System.out.print(currentVertex + " ");
			
			// explore all unvisited neighbours of current vertex
			for(int j = 0 ; j<adjMatrix.length; j++) {
				if(adjMatrix[currentVertex][j] == 1 && visited[j] == false) {
					// j is unvisited vertex of currentVertex
					pendingVertices.add(j);
					// make it as true, so same j don't get in queue again 
					visited[j] = true;
				 }
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int e = scan.nextInt();
		
        // special case
        if(n == 0 && e == 0){
            return;
        }

		int[][] adjMatrix = new int[n][n];
		for(int i = 0 ; i<e; i++) {
			int v1 = scan.nextInt();
			int v2 = scan.nextInt();

			adjMatrix[v1][v2] = 1;
			adjMatrix[v2][v1] = 1;
		}


		for(int row = 0 ; row<n; row++) {
			for(int col = 0 ; col<n; col++) {
				System.out.print(adjMatrix[row][col] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("DFT: ");
		dfTraversal(adjMatrix);
		
		System.out.println();
		System.out.println("BFT: ");
		bfTraversal(adjMatrix);

	}

}