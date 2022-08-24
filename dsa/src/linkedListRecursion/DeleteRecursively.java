package linkedListRecursion;

import linkedListInJava.Node;

public class DeleteRecursively {
	
	public static Node<Integer> deleteRec(Node<Integer> head, int pos){
		
		if(head == null) {
			return head;
		}
		
		if(pos == 0) {
			return head.next;
		}else {
		 Node<Integer> smallHead = deleteRec(head.next, pos-1);
		 head.next = smallHead;
		 return head;
		}
	}

	public static void main(String[] args) {
		Node<Integer> head = Node.createLinkedList();
		Node.printLL(head);
		System.out.println();
		head = deleteRec(head, 9);
		Node.printLL(head);

	}

}
