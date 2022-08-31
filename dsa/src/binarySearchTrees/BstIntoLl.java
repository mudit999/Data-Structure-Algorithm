package binarySearchTrees;

import trees.BinaryTreeNode;
import trees.TakePrintInputLevelWise;
import linkedListInJava.Node;

public class BstIntoLl {

	public static BstIntoLlReturn helper(BinaryTreeNode<Integer> root){
		if(root == null) {
			BstIntoLlReturn ans = new BstIntoLlReturn(null,null);
			return ans;
		}
		
		BstIntoLlReturn leftTree = helper(root.left);
		Node<Integer> n1= new Node<Integer>(root.data);
		BstIntoLlReturn rightTree = helper(root.right);
		
		Node<Integer> head = null;
		Node<Integer> tail = null;
		
		if(leftTree.head != null) {
			n1.next = rightTree.head;
			leftTree.tail.next = n1;
			head = leftTree.head;
		}else {
			n1.next = rightTree.head;
			head = n1; // return n1 - new head
		}
		tail = rightTree.tail;
		
		
		// if rightTree is empty/null - IMPORTANT
		if(rightTree.head == null) {
			tail = n1;
		}else {
			tail = rightTree.tail;
		}
		
		BstIntoLlReturn ans = new BstIntoLlReturn(head,tail);
		return ans;
	}
	
	public static Node<Integer> bstIntoLL(BinaryTreeNode<Integer> root) {
		BstIntoLlReturn ans = helper(root);
		return ans.head;
	}
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = TakePrintInputLevelWise.takeInputLevelWise();
		Node<Integer> head = bstIntoLL(root);
		Node.printLL(head);
	}

}
