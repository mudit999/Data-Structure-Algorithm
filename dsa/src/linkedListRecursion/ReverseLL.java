package linkedListRecursion;
import linkedListInJava.Node;

public class ReverseLL {

	public static Node<Integer> reverseLL(Node<Integer> head){
		// base case
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer> revHead = reverseLL(head.next);
		
		// traversing till last node - tail
		Node<Integer> tail = revHead;
		while(tail.next != null) {
			tail = tail.next;
		}
		tail.next = head;
		head.next = null;
		return revHead;
	}
	
	public static DoubleNode<Integer> reverseLLBetter(Node<Integer> head){
		// base case
		DoubleNode<Integer> ans;
		if(head == null || head.next == null) {
			ans = new DoubleNode<>();
			ans.head = head;
			ans.tail = head;
			return ans;
		}
		
		DoubleNode<Integer> smallAns = reverseLLBetter(head.next);
		smallAns.tail.next = head;
		head.next = null;
		ans = new DoubleNode<>();
		ans.head = smallAns.head;
		ans.tail = head;
		return ans;
	}
	
	// With this function we basically hide the DoubleNode, external user won't know about this
	public static Node<Integer> reverseLLBetterDriver(Node<Integer> head){
		DoubleNode<Integer> ans = reverseLLBetter(head);
		return ans.head;
	}
	
	public static Node<Integer> reverseLLBest(Node<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		
		Node<Integer> tail = head.next;
		Node<Integer> smallAns = reverseLLBest(head.next);
		tail.next = head;
		head.next = null;
		return smallAns;
	}

	
	
	public static void main(String[] args) {
		Node<Integer> head = Node.createLinkedList();
		Node.printLL(head);
		System.out.println();
//		head = reverseLL(head);
//		Node.printLL(head);
//		DoubleNode<Integer> ans = reverseLLBetter(head);
//		Node.printLL(ans.head);
//		head = reverseLLBetterDriver(head);
//		Node.printLL(head);
		
		head = reverseLLBest(head);
		Node.printLL(head);
	}

}
