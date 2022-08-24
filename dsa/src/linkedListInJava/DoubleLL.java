package linkedListInJava;

public class DoubleLL {
	
	public static Node<Integer> createCirularLL(){
		Node<Integer> n1 = new Node<Integer>(10);
		Node<Integer> n2 = new Node<Integer>(20);
		Node<Integer> n3 = new Node<Integer>(30);
		n1.next = n2;
		n2.next = n3;
		n3.next = n1;
		// return head
		return n1;
	}
	
	public static void printCircularLL(Node<Integer> head) {
		Node<Integer> temp = head;
		// execute atleast once
		// then check condition if true
		do {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		while(temp.next != head); 
		// if while condition fails
		System.out.print(temp.data + " ");
		temp = temp.next;
	}
	
	public static void main(String[] args) {
		Node<Integer> head = createCirularLL();
		printCircularLL(head);
	}

}