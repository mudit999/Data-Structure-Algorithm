package binaryTree;

public class BST {
	private BinaryTreeNode<Integer> root;
	private int size;
	
	// static - because this function is independent of BST object - becomes property of class
	private static boolean isPresentHelper(BinaryTreeNode<Integer> root, int x) {
		if(root == null) {
			return false;
		}
		
		if(root.data == x) {
			return true;
		}
		
		if(x < root.data) {
			// call on left side of BST 
			return isPresentHelper(root.left,x);
		}else {
			// call on right side of BST 
			return isPresentHelper(root.right,x);
		}
	}
	
	public boolean isPresent(int x) {
		return isPresentHelper(root,x);
	}
	
	private static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> root, int x){
		// base case
		if(root == null) {
			BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(x);
			return newNode;
		}
		
		if(x >= root.data) {
			root.right = insertHelper(root.right,x);
		}else {
			root.left = insertHelper(root.left,x);
		}
		return root;
	}
	
	public void insert(int x) {
		// IMP: Don't forget to update the root
		root = insertHelper(root, x);
		size++;
	}
	
	private static int minimum(BinaryTreeNode<Integer> root){
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		
		int leftAns = minimum(root.left);
		int rightAns = minimum(root.right);
		return Math.min(root.data, Math.min(leftAns, rightAns));
	}
	
	private static deleteDataReturn deleteDataHelper(BinaryTreeNode<Integer> root, int x) {
		if(root == null) {
			return new deleteDataReturn(null, false);
		}
		
		if(x > root.data) {
			deleteDataReturn rightOutput = deleteDataHelper(root.right,x);
			root.right = rightOutput.root;
			return new deleteDataReturn(root.right, true);
		}
		
		if(x < root.data) {
			deleteDataReturn leftOutput = deleteDataHelper(root.left,x);
			root.left = leftOutput.root;
			return new deleteDataReturn(root.left, true);
		}
	
		// 0 children
		if(root.left == null && root.right ==  null) {
			return new deleteDataReturn(null, true);
		}
		// 1 child
		if(root.left == null && root.right != null) {
			return new deleteDataReturn(root.right, true);
		}
		
		if(root.right == null && root.left != null) {
			return new deleteDataReturn(root.left, true);

		}
		
		// 2 children present
		int minData = minimum(root.right);
		
		// update root replacement
		root.data = minData;
		deleteDataReturn rightOutput = deleteDataHelper(root.right,minData);
		root.right = rightOutput.root;
		return new deleteDataReturn(root, true);
	}
	
	public boolean deleteData(int x) {
		// return false when data is not present -> hence not able to delete
		// else return true
		deleteDataReturn ans = deleteDataHelper(root, x);
		root = ans.root;
		if(ans.deletedOrNot) {
			size--;
		}
		return ans.deletedOrNot;
	}
	
	public int size() {
		return size;
	}
	
	public static void printTreeHelper(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		
		System.out.print(root.data + " : ");
		
		if(root.left != null) {
			System.out.print("L" + root.left.data + ", ");
		}
		
		if(root.right != null) {
			System.out.print("R" + root.right.data);
		}
		
		System.out.println();
		
		printTreeHelper(root.left);
		printTreeHelper(root.right);
	}
	
	public void printTree() {
		printTreeHelper(root);
	}
}
