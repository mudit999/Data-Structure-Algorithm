package binaryTree;

public class BinaryTreeQues2 {
		
	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
	
		// left call
		mirrorBinaryTree(root.left);
		// right call
		mirrorBinaryTree(root.right);
		
		// processing the root/parent - swapping the nodes
		BinaryTreeNode<Integer> temp = root.left;
		root.left = root.right;
		root.right = temp;
	}

	public static BinaryTreeNode<Integer> removeLeafNode(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return null;
		}
		
		// root is a leaf
		if(root.left == null && root.right == null) {
			return null;
		}
		
		root.left = removeLeafNode(root.left);
		root.right = removeLeafNode(root.right);
		return root;
	}
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true,0,true);
//		BinaryTreeNode<Integer> newRoot = removeLeafNode(root);
		mirrorBinaryTree(root);
		BinaryTreeUse.printTreeDetailed(root);
	}

}
