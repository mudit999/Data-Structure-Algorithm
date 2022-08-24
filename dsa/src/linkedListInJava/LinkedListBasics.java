package linkedListInJava;

public class LinkedListBasics {
	public static Node<Integer> createLinkedList() {
		Node<Integer> head;
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
		Node<Integer> n5 = new Node<>(50);
		
		head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		return head;
	}
	
	public static void printIthNode(Node<Integer> head, int i) {
		int position = 0;
		Node<Integer> temp = head;
		
		while(temp != null && position < i) {
			temp = temp.next;
			position++;
		}
		
		if(temp!=null) {
			System.out.println(temp.data);
		}
	}
	
	public static void main(String[] args) {
		Node<Integer> head = createLinkedList();
		printIthNode(head, 0);
	}
}