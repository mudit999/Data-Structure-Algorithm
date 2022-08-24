package linkedListRecursion;
import linkedListInJava.Node;

public class printNodesData {

	public static void printNodeD(Node<Integer> head) {
		
		// base case
		if(head == null) {
			return;
		}
		
		// IS
		System.out.print(head.data + " ");
		//IH
		printNodeD(head.next);
	}
	
	public static void main(String[] args) {
		Node<Integer> head = Node.createLinkedList();
		Node.printLL(head);
		System.out.println();
		printNodeD(head);
	}
}