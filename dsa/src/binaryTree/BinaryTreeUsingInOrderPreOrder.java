package binaryTree;

public class BinaryTreeUsingInOrderPreOrder {

	public static BinaryTreeNode<Integer> treeUsingInOrderPreOrder(int[] preOrder, int[] inOrder){
		if(preOrder.length == 0 && inOrder.length == 0) {
			return null;
		}
		
		// find root
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(preOrder[0]);
		
		// find inOrder of both left and right subtree
		int rootIndexInOrder = 0;
		for(int i = 0 ; i<inOrder.length; i++) {
			if(inOrder[i] == root.data) {
				rootIndexInOrder = i;
			}
		}
		
		int[] leftSubTreeInOrder = new int[inOrder.length/2];
		for(int i = 0 ; i<rootIndexInOrder; i++) {
			leftSubTreeInOrder[i] = inOrder[i];
		}
		
		int newIndex = 0;
		int[] rightSubTreeInOrder = new int[inOrder.length/2];
		for(int i = rootIndexInOrder + 1 ; i<inOrder.length; i++) {
			rightSubTreeInOrder[newIndex] = inOrder[i];
			newIndex++;
		}
		
		// find preOrder of both left and right subtree
		newIndex = 0;
		int[] leftSubTreePreOrder = new int[preOrder.length/2];
		for(int i = 1 ; i<=leftSubTreeInOrder.length;i++) {
			leftSubTreePreOrder[newIndex] = preOrder[i];
			newIndex++;
		}
		
		newIndex = 0;
		int[] rightSubTreePreOrder = new int[preOrder.length/2];
		for(int i = leftSubTreeInOrder.length+1 ; i<leftSubTreeInOrder.length;i++) {
			rightSubTreePreOrder[newIndex] = preOrder[i];
			newIndex++;
		}
		
		// recursion calls
		BinaryTreeNode<Integer> resultInOrderPreOrderLeft = treeUsingInOrderPreOrder(leftSubTreePreOrder,leftSubTreeInOrder);
		BinaryTreeNode<Integer> resultInOrderPreOrderRight = treeUsingInOrderPreOrder(rightSubTreePreOrder,rightSubTreeInOrder);
		
		root.left = resultInOrderPreOrderLeft;
		root.right = resultInOrderPreOrderRight;
		return root;
		
 	}
	
	public static void main(String[] args) {
		int[] inOrder = {4,2,5,1,6,3,7};
		int[] preOrder = {1,2,4,5,3,6,7};
		
		BinaryTreeNode<Integer> root = treeUsingInOrderPreOrder(preOrder,inOrder);
		TakePrintInputLevelWise.printTreeLevelWise(root);
	}

}
