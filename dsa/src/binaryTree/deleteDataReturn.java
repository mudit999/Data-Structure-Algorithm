package binaryTree;

public class deleteDataReturn {
	BinaryTreeNode<Integer> root;
	boolean deletedOrNot;
	
	public deleteDataReturn(BinaryTreeNode<Integer> root, boolean deletedOrNot) {
		this.root = root;
		this.deletedOrNot = deletedOrNot;
	}
}
