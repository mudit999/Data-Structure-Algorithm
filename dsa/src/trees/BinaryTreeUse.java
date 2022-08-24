package trees;

import java.util.Scanner;

public class BinaryTreeUse {
	
	public static int sumOfNodes(BinaryTreeNode<Integer> root) {
		// base
		if(root == null) {
			return 0;
		}
		
		int leftTreeSum = sumOfNodes(root.left);
		int rightTreeSum = sumOfNodes(root.right);
		return root.data + leftTreeSum + rightTreeSum;
	}
	
	public static int numOfNodesInTree(BinaryTreeNode<Integer> root) {
		// base case
		if(root == null) {
			return 0;
		}
		
		// IH
		int leftNodes = numOfNodesInTree(root.left);
		int rightNodes = numOfNodesInTree(root.right);
		// IS
		return leftNodes + rightNodes + 1;
	}
	
	public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft){
		if(isRoot) {
			System.out.println("Enter root data");
		}else {
			if(isLeft) {
				System.out.println("Enter left node data " + parentData);
			}else {
				System.out.println("Enter right node data " + parentData);
			}
		}
		
		Scanner scan = new Scanner(System.in);
		int rootData = scan.nextInt();
		
		if(rootData == -1) {
			return null;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false,rootData,true);
		BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false,rootData,false);
		root.left = leftChild;
		root.right = rightChild;
		return root;
	}
	
	public static BinaryTreeNode<Integer> takeTreeInput(){
		System.out.println("Enter root data");
		Scanner scan = new Scanner(System.in);
		int rootData = scan.nextInt();
		
		if(rootData == -1) {
			return null;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild = takeTreeInput();
		BinaryTreeNode<Integer> rightChild = takeTreeInput();
		root.left = leftChild;
		root.right = rightChild;
		return root;
	}
	
	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
//		System.out.print(root.data + ": L" + root.left.data + " R" + root.right.data);
//		System.out.println();
		System.out.print(root.data + " : ");
		if(root.left != null) {
			System.out.print("L" + root.left.data + ", ");
		}
		if(root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();
		
		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}

	public static void printTree(BinaryTreeNode<Integer> root) {
		// TODO take care of base case
		if(root == null) {
			return;
		}
		System.out.println(root.data);
		printTree(root.left);
		printTree(root.right);
		
		// this will fail when root is null/ empty tree
//		if(root.left != null) {
//			printTree(root.left);
//		}
//		if(root.right != null) {
//			printTree(root.right);
//		}
	}
	
	public static void main(String[] args) {
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
//		BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
//		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
//		root.left = rootLeft;
//		root.right = rootRight;
//		
//		
//		BinaryTreeNode<Integer> rootLeftRight = new BinaryTreeNode<Integer>(4);
//		BinaryTreeNode<Integer> rootRightLeft = new BinaryTreeNode<Integer>(5);
//		
////		rootLeft.left = null;
//		rootLeft.right = rootLeftRight;
//		
//		rootRight.left = rootRightLeft;
//		rootRight.right = null;
		
//		printTree(root);
		
		BinaryTreeNode<Integer> root = takeTreeInputBetter(true,0,true);
		printTreeDetailed(root);
		System.out.println();
//		System.out.println(numOfNodesInTree(root));
		System.out.println(sumOfNodes(root));
	}
}