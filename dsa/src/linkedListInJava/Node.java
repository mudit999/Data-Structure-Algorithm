package linkedListInJava;

public class Node<T> {
	public T data;
	public Node<T> next;
	
	// default Constructor
	public Node(){
		
	}
	
	// constructor
	public Node(T data){
		this.data = data;
//		next = null; //by default
	}
	
	public static Node<Integer> createLinkedList() {
		Node<Integer> n1 = new Node<>(2);
		Node<Integer> n2 = new Node<>(6);
		Node<Integer> n3 = new Node<>(1);
		Node<Integer> n4 = new Node<>(5);
		Node<Integer> n5 = new Node<>(3);
		Node<Integer> n6 = new Node<>(4);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		return n1;
	}
	
	public static void printLL(Node<Integer> head) {
		Node<Integer> temp = head;
		
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public static int size(Node<Integer> head) {
		Node<Integer> temp = head;
			
		int count= 0;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
}