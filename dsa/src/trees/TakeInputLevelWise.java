package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TakeInputLevelWise {

	// Iterative solution
	public static BinaryTreeNode<Integer> takeInputLevelWise(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter root");
		int rootData = scan.nextInt();
		
		// empty tree
		if(rootData == -1) {
			return null;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		Queue<BinaryTreeNode<Integer>> pendingChildrenQueue = new LinkedList<BinaryTreeNode<Integer>>();
		pendingChildrenQueue.add(root);
		
		while(!pendingChildrenQueue.isEmpty()) {
			BinaryTreeNode<Integer> front = pendingChildrenQueue.poll();
			
			// for left child
			System.out.println("Enter left child of "+ front.data);
			int leftData = scan.nextInt();
			if(leftData != -1) {
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftData);
				front.left = leftChild;
				pendingChildrenQueue.add(leftChild);
			}
			
			// for right child
			System.out.println("Enter right child of "+ front.data);
			int rightData = scan.nextInt();
			if(rightData != -1) {
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightData);
				front.right = rightChild;
				pendingChildrenQueue.add(rightChild);
			}
		}
		return root;
	}
	
	public static void printTreeLevelWise(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		Queue<BinaryTreeNode<Integer>> pendingChildrenQueue = new LinkedList<BinaryTreeNode<Integer>>();
		pendingChildrenQueue.add(root);
		
		while(!pendingChildrenQueue.isEmpty()) {
			
			BinaryTreeNode<Integer> front = pendingChildrenQueue.poll();
			
			System.out.print(front.data + ":");
			
			if(front.left != null) {
				System.out.print("L:" + front.left.data + ",");
			}else {
				System.out.print("L:-1,");
			}
			
			if(front.right != null) {
				System.out.print("R:" + front.right.data);
			}else {
				System.out.print("R:-1");
			}
			
			// new line
			System.out.println();
			
			// add children of front node in queue
			if(front.left != null) {
				pendingChildrenQueue.add(front.left);
			}
			
			if(front.right != null) {
				pendingChildrenQueue.add(front.right);
			}
		}
	}
	
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		System.out.println();
//		BinaryTreeUse.printTreeDetailed(root); 
//		System.out.println();
//
//		TraversalOrder.preOrder(root);
		printTreeLevelWise(root);
	}

}
