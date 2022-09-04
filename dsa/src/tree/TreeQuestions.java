package tree;

public class TreeQuestions {

	// no of nodes
	public static int noOfNodes(TreeNode<Integer> root) {
		
		// edge case
		if(root == null) {
			return 0;
		}
		
		// count = 1 for root at every level 
		int count = 1;
		
		// Base case: if no child of parent, then it will not call
		for(int i = 0 ; i<root.children.size(); i++) {
			count = count + noOfNodes(root.children.get(i));
		}
		return count;
	}
	
	// sum of all nodes
	public static int sumOfAllNodes(TreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		
		int sum = root.data;
		for(int i = 0 ; i<root.children.size(); i++) {
			sum += sumOfAllNodes(root.children.get(i));
		}
		return sum;
	}
	
	// largest data node
	public static int largestOfAllNodes(TreeNode<Integer> root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		
		int ans = root.data;
		for(int i = 0 ; i<root.children.size(); i++) {
			int largestChildData = largestOfAllNodes(root.children.get(i));
			if(largestChildData > ans) {
				ans =  largestChildData;
			}
		}
		return ans;
	}
	
	// no of nodes greater than x
	public static int noOfNodesGreaterThanX(TreeNode<Integer> root, int x) {
		if(root == null) {
			return 0;
		}
		
		int count = 0;
		if(root.data > x) {
			count = count+1;
		}
		
//		for(int i = 0 ; i<root.children.size(); i++) {
//			int countForSubTree = noOfNodesGreaterThanX(root.children.get(i), x);
//			count = count + countForSubTree;
//		}
		
		// for each loop
		for(TreeNode<Integer> child : root.children)
			count = count + noOfNodesGreaterThanX(child,x);
		return count;
	}
	
	// height of tree
	public static int heightOfTree(TreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		
		int ans = 0;
		for(TreeNode<Integer> child : root.children) {
			int childHeight = heightOfTree(child);
			if(childHeight > ans) {
				ans = childHeight;
			}
		}
		return 1 + ans;
	}

	// print nodes at depth k
	public static void printNodesAtDepthK(TreeNode<Integer> root, int k){
		if(k < 0) {
			return;
		}
		
		if(k == 0) {
			System.out.println(root.data);
			return;
		}
		
		for(int i = 0 ; i<root.children.size(); i++) {
			printNodesAtDepthK(root.children.get(i),k-1); 
		}
	}
	
	// no of leaf nodes
	public static int noOfLeafNodes(TreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		
		if(root.children.size() == 0) {
			return 1;
		}
		
		int count = 0;
		for(int i = 0 ; i < root.children.size();i++) {
			count += noOfLeafNodes(root.children.get(i));
		}
		return count; 
	}
	
	// preOrder traversal
	public static void preOrder(TreeNode<Integer> root) {
		// edge case
		if(root == null) {
			return;
		}
		
		System.out.print(root.data + " ");
		for(int i = 0 ; i<root.children.size(); i++) {
			preOrder(root.children.get(i));
		}
	}
	
	// postOrder traversal
	public static void postOrder(TreeNode<Integer> root) {
		// edge case
		if(root == null) {
			return;
		}
		
		for(int i = 0 ; i<root.children.size(); i++) {
			postOrder(root.children.get(i));
		}
		System.out.print(root.data + " ");
	}
	
	public static void main(String[] args) {
		TreeNode<Integer> root = TakePrintTreeLevelWise.takeInputLevelWise();
		System.out.println(noOfNodes(root));
		System.out.println(sumOfAllNodes(root));
		System.out.println(largestOfAllNodes(root));
		System.out.println(noOfNodesGreaterThanX(root, 6));
		System.out.println(heightOfTree(root));
		printNodesAtDepthK(root, 2);
		System.out.println(noOfLeafNodes(root));
		preOrder(root);
		postOrder(root);
	}

}
