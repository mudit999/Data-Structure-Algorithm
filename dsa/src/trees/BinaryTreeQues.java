package trees;

public class BinaryTreeQues {
	
	public static void nodesWithoutSibling(BinaryTreeNode<Integer> root) {
		// base
		if(root == null) {
			return;
		}
		
		if(root.left == null && root.right == null) {
			return;
		}
		
//		if(root.left == null || root.right == null) {
//			System.out.print(root.data + " ");
//		}
		
//		if(root.right == null) {
//			System.out.print(root.left.data);
//		}else {
//			System.out.print(root.right.data);
//		}
		
        if(root.left == null){
			System.out.print(root.right.data + " ");
		}
		else if(root.right == null) {
			System.out.print(root.left.data + " ");
		}
		
		nodesWithoutSibling(root.left);
		nodesWithoutSibling(root.right);
	}
	
	// same algo, efficient way of writing
	public static boolean isNodePresentBetter(BinaryTreeNode<Integer> root, int x) {
		if(root == null) {
			return false;
		}
		
		if(root.data.equals(x)) {
			return true;
		}
		
		return (isNodePresentBetter(root.left,x) || isNodePresentBetter(root.right,x) );
	}
	
	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
		if(root == null) {
			return false;
		}
		
		if(root.data == x) {
			return true;
		}
		boolean ansLeftSubTree = isNodePresent(root.left, x);
		if(ansLeftSubTree) {
			return true;
		}else {
			boolean ansRightSubTree = isNodePresent(root.right,x);
			return ansRightSubTree;
		}
	}
	
	public static void replaceNode(BinaryTreeNode<Integer> root, int level) {
		if(root == null) {
			return;
		}
		
		root.data = level;
		replaceNode(root.left, level+1);
		System.out.print(root.data + " ");
		replaceNode(root.right, level+1);
	}
	
	public static void replaceNodeMain(BinaryTreeNode<Integer> root) {
		replaceNode(root,0);
	}
	
	public static void depthOfNode(BinaryTreeNode<Integer> root, int k) {
		if(root == null) {
			return;
		}
		
		if(k == 0) {
			System.out.print(root.data + " ");
			return;
		}
		
		depthOfNode(root.left, k-1);
		depthOfNode(root.right, k-1);
	}
	
	public static int numOfLeafNodes(BinaryTreeNode<Integer> root) {
		// base case
		if(root == null) {
			return 0;
		}
		
		// IS
		// leaf node
		if(root.left == null && root.right == null) {
			return 1;
		}
		
		// IH
		int leftSubTreeLeaf = numOfLeafNodes(root.left);
		int rightSubTreeLeaf = numOfLeafNodes(root.right);
		return leftSubTreeLeaf + rightSubTreeLeaf;
	}
	
	public static int heightOfTree(BinaryTreeNode<Integer> root) {
		// base case
		if(root == null) {
			return 0;
		}
		
		int leftSubTreeHeight = heightOfTree(root.left);
		int rightSubTreeHeight = heightOfTree(root.right);
		return 1 + Math.max(leftSubTreeHeight, rightSubTreeHeight);
	}
	
	public static int nodesGreaterThanX(BinaryTreeNode<Integer> root, int X) {
		if(root == null) {
			return 0;
		}
		
		int leftNodes = nodesGreaterThanX(root.left,X);
		int rightNodes = nodesGreaterThanX(root.right,X);
		int rootGreaterOrNot = root.data > X ? 1 : 0;
		return leftNodes + rightNodes + rootGreaterOrNot;
	}

	public static int largestDataInTree(BinaryTreeNode<Integer> root) {
		// base case
		if(root == null) {
			return -1;
		}
		int leftSubTreeLargest = largestDataInTree(root.left);
		int rightSubTreeLargest = largestDataInTree(root.right);
		return Math.max(root.data, Math.max(leftSubTreeLargest, rightSubTreeLargest));
	}
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true,0,true);
//		System.out.println(largestDataInTree(root));
//		System.out.println(nodesGreaterThanX(root, 5));
//		System.out.println(heightOfTree(root));
//		System.out.println(numOfLeafNodes(root));
//		depthOfNode(root, 1);
//		replaceNodeMain(root);
//		System.out.println(isNodePresent(root, 4));
		nodesWithoutSibling(root);

	}

}
