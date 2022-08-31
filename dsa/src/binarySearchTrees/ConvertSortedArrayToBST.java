package binarySearchTrees;

import trees.BinaryTreeNode;
import trees.TakePrintInputLevelWise;

public class ConvertSortedArrayToBST {

	public static BinaryTreeNode<Integer> convertSortedArrayToBST(int[] arr, int si, int ei) {
		// base
		if(si > ei) {
			return null;
		}
		
		// find middle
		int midIndex = (si+ei)/2;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[midIndex]);
		
		BinaryTreeNode<Integer> leftSubtree = convertSortedArrayToBST(arr,si,midIndex-1);
		BinaryTreeNode<Integer> rightSubtree = convertSortedArrayToBST(arr,midIndex+1,ei);
		
		root.left = leftSubtree;
		root.right = rightSubtree;
		return root;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		BinaryTreeNode<Integer> root = convertSortedArrayToBST(arr,0,arr.length-1);
		TakePrintInputLevelWise.printTreeLevelWise(root);
	}

}
