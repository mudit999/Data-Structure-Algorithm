package pramp;

// Question: https://www.pramp.com/challenge/15oxrQx6LjtQj9JK9XqA

public class SalesPathQ {
	
		static class Node {
		    int cost;
		    Node[] children;
		    Node parent;
	
		    Node(int cost) {
		      this.cost = cost;
		      children = null;
		      parent = null;
		    }
		  }
	        
	    int getCheapestCost(Node rootNode) {
	      // your code goes here
	      
	      int n = rootNode.children.length;
	      
	      // base case
	      if(n == 0){
	        return rootNode.cost;
	      }
	      
	      int minCost = Integer.MAX_VALUE;
	      for(int i= 0 ; i<rootNode.children.length; i++){
	        int tempCost = getCheapestCost(rootNode.children[i]);
	        if(tempCost < minCost){
	          minCost = tempCost;
	        }
	      }
	      
	      return minCost + rootNode.cost;
	    }
	  
	  public static void main(String[] args) {
		
	}
}
