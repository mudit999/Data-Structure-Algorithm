package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph {

	public static void connectedOrNotHelper(int[][] adjMatrix, int currentVertex, boolean[] visited) {
		visited[currentVertex] = true;

		for(int j = 0 ; j < adjMatrix.length; j++) {
			if(adjMatrix[currentVertex][j] == 1 && visited[j] == false) {
				// j is unexplored neighbour of currentVertex 
				connectedOrNotHelper(adjMatrix, j, visited);
			}
		}
	}

	public static boolean connectedOrNot(int[][] adjMatrix, int currentVertex) {
		boolean[] visited = new boolean[adjMatrix.length];
		connectedOrNotHelper(adjMatrix, 0 ,visited);
		for(int i = 0 ; i<visited.length ; i++) {
			if(visited[i] == false) {
				return false;
			}
		}
		return true;
	}



	public static ArrayList<Integer> getPathBFT(int[][] adjMatrix, int source, int destination){
		Queue<Integer> pendingVertices = new LinkedList<>();
		boolean[] visited = new boolean[adjMatrix.length];
		// to keep track of neighbour and current vertex/parent vertex
		HashMap<Integer, Integer> map = new HashMap<>();

		visited[source] = true;
		pendingVertices.add(source);
		map.put(source, -1);
		boolean pathFound = false;

		// till queue get empty, get front of queue
		while(!pendingVertices.isEmpty()) {
			int currentVertex = pendingVertices.poll();

			// explore all unvisited neighbours of current vertex
			for(int neighbour = 0; neighbour<adjMatrix.length; neighbour++) {
				if(adjMatrix[currentVertex][neighbour] == 1 && visited[neighbour] == false) {
					// neighbour is unvisited vertex of currentVertex
					pendingVertices.add(neighbour);
					map.put(neighbour, currentVertex);
					// make it as true, so same neighbour don't get in queue again 
					visited[neighbour] = true;

					// if reach destination vertex
					if(currentVertex == destination) {
						pathFound = true;
						break;
					}
				}
			}
		}

		// now you got the map
		//		System.out.println(map);

		if(map.containsKey(destination)) {
			ArrayList<Integer> path = new ArrayList<>();			
			int currentVertex = destination;
			while(currentVertex != -1) {
				path.add(currentVertex);
				int parent = map.get(currentVertex);
				currentVertex = parent;
			}
			return path;	
		}else {
			return null;
		}
	}

	public static ArrayList<Integer> getPathDFT(int[][] adjMatrix, int currentVertex, int destination, boolean[] visited){
		visited[currentVertex] = true;
		if(currentVertex == destination) {
			ArrayList<Integer> list = new ArrayList<>();
			list.add(currentVertex);
			return list;
		}

		for(int j = 0 ; j<adjMatrix.length; j++) {
			if(adjMatrix[currentVertex][j] == 1 && visited[j] == false) {
				// all j are neighbours
				ArrayList<Integer> ans =  getPathDFT(adjMatrix, j, destination, visited);
				if(ans != null) {
					// appending source to it
					ans.add(currentVertex);
					return ans;
				}
			}
		}

		return null;
	}

	public static boolean hasPathDFT(int[][] adjMatrix, int currentVertex, int destination, boolean[] visited) {
		visited[currentVertex] = true;
		if(currentVertex == destination) {
			return true;
		}

		for(int j = 0 ; j < adjMatrix.length; j++) {
			if(adjMatrix[currentVertex][j] == 1 && visited[j] == false) {
				// j is unexplored neighbour of currentVertex 
				boolean ans = hasPathDFT(adjMatrix, j, destination, visited);
				if(ans == true) {
					return ans;
				}
			}
		}
		return false;
	}

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
		boolean[] visited = new boolean[adjMatrix.length]; 

		for(int i = 0 ; i<adjMatrix.length; i++) {
			if(!visited[i]) {
				dfTraversalHelper(adjMatrix, i, visited);
			}
		}

	}

	// Iterative code - BFT
	public static void bfTraversal(int[][] adjMatrix) {
		Queue<Integer> pendingVertices = new LinkedList<Integer>();
		boolean[] visited = new boolean[adjMatrix.length];

		for(int i = 0 ; i<adjMatrix.length; i++){
			// marking i as visited and putting it in queue 

			if(!visited[i]) {		
				visited[i] = true;
				pendingVertices.add(i);

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

		boolean[] visited = new boolean[adjMatrix.length];
		boolean anshasPath = hasPathDFT(adjMatrix,0,4, visited);
		System.out.println();

		System.out.println(anshasPath);

		ArrayList<Integer> ansGetPathDFT = getPathDFT(adjMatrix, 0, 5, visited);
		System.out.println();

		System.out.println(ansGetPathDFT);

		ArrayList<Integer> ansGetPathBFT = getPathBFT(adjMatrix, 1, 3);
		System.out.println();
		System.out.println(ansGetPathBFT);

		System.out.println();

		System.out.println(connectedOrNot(adjMatrix,0));
	}

}