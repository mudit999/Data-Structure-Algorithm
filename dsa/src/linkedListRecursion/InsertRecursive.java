package linkedListRecursion;

import linkedListInJava.Node;

public class InsertRecursive {

	public static Node<Integer> insertRec(Node<Integer> head, int i, int iData) {
		if(head == null && i > 0) {
			return head;
		}
		
		// if i = 0
		if(i == 0) {
			Node<Integer> newNode = new Node<Integer>(iData);
			newNode.next = head;
			return newNode;
		}else {
			Node<Integer> smallerHead = insertRec(head.next, i-1, iData);
			head.next = smallerHead;
			return head;
		}	
	}
	
	public static void main(String[] args) {
		Node<Integer> head = Node.createLinkedList();
		Node.printLL(head);
		System.out.println();
		head = insertRec(head, 9, 99);
		Node.printLL(head);
	}
}