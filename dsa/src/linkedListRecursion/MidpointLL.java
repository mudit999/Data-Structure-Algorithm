package linkedListRecursion;

import linkedListInJava.Node;

public class MidpointLL {

	public static Node<Integer> midpoint(Node<Integer> head) {

		if(head == null || head.next == null) {
			return head;
		}
		
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		
		while(fast.next != null &&  fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	public static void main(String[] args) {
		Node<Integer> head = Node.createLinkedList();
		Node.printLL(head);
		System.out.println();
		Node<Integer> mid = midpoint(head);
		System.out.println(mid.data);
	}

}
