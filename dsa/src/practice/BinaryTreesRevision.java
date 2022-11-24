package practice;

import java.util.Scanner;

class BinaryTreeNodeR{
	int data;
	BinaryTreeNodeR left;
	BinaryTreeNodeR right;
	
	public BinaryTreeNodeR(int data) {
		this.data = data;
	}
}

public class BinaryTreesRevision { 
	
	public static BinaryTreeNodeR takeInputBetter(boolean isRoot, int parentData, boolean isLeft) {
		if(isRoot) {
			System.out.println("Enter root data");
		}else {
			if(isLeft) {
				System.out.println("Enter left node data of " + parentData);
				
			}else {
				System.out.println("Enter right node data of " + parentData);
			}
		}
		
		Scanner scan = new Scanner(System.in);
		int data = scan.nextInt();
		
		// base condition
		if(data == -1) {
			return null;
		}
		
		BinaryTreeNodeR btNode = new BinaryTreeNodeR(data);
		
		BinaryTreeNodeR leftChild = takeInputBetter(false, data, true);
		BinaryTreeNodeR rightChild = takeInputBetter(false, data, false);
		
		btNode.left = leftChild;
		btNode.right = rightChild;
		return btNode;
	}
	
	public static void printTree(BinaryTreeNodeR root) {
		if(root == null) {
			return;
		}
		
		System.out.print(root.data + " ");
		printTree(root.left);
		printTree(root.right);
	}
	
	public static void main(String[] args) {
		BinaryTreeNodeR root = takeInputBetter(true, 0, true);
		printTree(root);
	}

}