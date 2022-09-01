package binaryTree;

public class TraversalOrder {

	public static void preOrder(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void postOrder(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}
	
	public static void inOrder(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true,0,true);
		System.out.print("PreOrder : ");
		preOrder(root);
		
		System.out.println();
		System.out.print("PostOrder : ");
		postOrder(root);
		
		System.out.println();
		System.out.print("InOrder : ");
		inOrder(root);

	}
}