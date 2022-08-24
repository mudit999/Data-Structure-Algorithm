package linkedListRecursion;

import linkedListInJava.Node;

public class DoubleNode<T> {
	Node<T> head;
	Node<T> tail;
	
	// default Constructor
	DoubleNode(){
		
	}
	
	DoubleNode(Node<T> head,Node<T> tail){
		this.head = head;
		this.tail = tail;
	}
}
