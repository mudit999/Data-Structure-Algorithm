package linkedListRecursion;

import java.util.Scanner;

import linkedListInJava.Node;

public class MergeSortInLL {
	
	public static Node<Integer> merge2SortedLLNode(Node<Integer> l1, Node<Integer> l2){
		
		// if both LL are null
		if(l1 == null && l2 == null){
            return null;
        }
        
		// if one of them is null
        if(l1 == null){
            return l2;
        }
        
        if(l2 == null){
            return l1;
        }
		
        // if both list contains elements
        Node<Integer> head;
        Node<Integer> tail;
		
		// initially setting up head, tail, l1 or l2
		if(l1.data > l2.data) {
			head = l2;
			tail = l2;
			l2 = l2.next;
		}else {
			head = l1;
			tail = l1;
			l1 = l1.next;
		}
		
		while(l1 != null && l2 != null) {
			if(l1.data > l2.data) {
				tail.next = l2;
				tail = l2;
				l2 = l2.next;
			}else {
				tail.next = l1;
				tail = l1;
				l1 = l1.next;
			}
		}
		
		// after traversal of l1 or l2, if any one of 2 LL get null
		if(l1 == null) {
			// l2 is remaining
			tail.next = l2;
		}else {
			tail.next = l1;
		}
		return head;
	}

	
	public static Node<Integer> mergeSortLL(Node<Integer> head) {
		
		// base case
		if(head == null || head.next == null) {
			return head;
		}
		
		//midpoint of LL
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
//		int midData = slow.data;
//		
//		Node<Integer> l1 = head;
//		Node<Integer> temp = head;
//		while(temp != null && temp.data != midData) {
//			temp = temp.next;
//		}
//		/// l2 list ready
//		Node<Integer> l2 = temp.next;
//		/// break the connection l1 is ready
//		temp.next = null;
		
		
		// l1 list
		Node<Integer> l1 = head;
		// l2 list
		Node<Integer> l2 = slow.next;
		// break the connection for l1 list
		slow.next = null;

		
		
		Node<Integer> sortedList1 = mergeSortLL(l1);
		Node<Integer> sortedList2 = mergeSortLL(l2);
		Node<Integer> newHead = merge2SortedLLNode(sortedList1,sortedList2);
		return newHead;
	}
	
	public static void printLL(Node<Integer> head) {
		Node<Integer> temp = head;
		
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public static Node<Integer> takeInput(){
		try (Scanner scan = new Scanner(System.in)) {
			// first input
			int data = scan.nextInt();
			Node<Integer> head = null, tail = null;
			
			while(data != -1) {
				Node<Integer> currentNode = new Node<>(data);
				if(head == null) {
					head = currentNode; 
					tail = currentNode;
				}else {
//				Node<Integer> tail = head;
//				while(tail.next != null) {
//					tail = tail.next;
//				}
//				tail.next = currentNode;
					
					tail.next = currentNode;
					tail = tail.next; // or tail = currentNode
				}
				data = scan.nextInt();
			}
			return head;
		}
	}
	
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		printLL(head);
		System.out.println();
		head = mergeSortLL(head);
		printLL(head);
	}
}